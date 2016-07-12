import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/3.
 */
public class Product {


    protected String name;
    protected BigDecimal price;
    private String barCode;

    public Product(BigDecimal productPrice) {
        this.price = productPrice;
    }

    public Product(String productName){
        this.name = productName;
    }

    public Product(String productName, BigDecimal productPrice){
        this.name = productName;
        this.price = productPrice;
    }

    public BigDecimal getPrice() {
        return this.price;
    }
    public String getName(){return  this.name;}
    public String getBarCode(){return  this.barCode;}

    public String printProductInfo(int num){
        String str = new StringBuilder("名称："+this).
                append("，数量："+num+"个").
                append("，单价："+this.price+"（元），").
                append("小计："+Discount.getDiscountFee(this,num,"NO_DISCOUNT")+"（元）").
                toString();
        BigDecimal discountMoney = Discount.getDiscountFee(this,num,"NO_DISCOUNT").subtract(Discount.getDiscountFee(this,num,"NO_DISCOUNT"));
        return !Discount.isDiscount(this,Discount.discountBarStr) ?  str: str+"，优惠："+discountMoney+"（元）";
    }
}
