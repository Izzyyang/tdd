import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2016/7/3.
 */
public abstract class Product {

    private static Map<String, Float> discountType= new HashMap<String, Float>();
    static{
        discountType.put("FIVE_PERCENT_DISCOUNT", 0.95f);
        discountType.put("TEN_PERCENT_DISCOUNT", 0.90f);
        discountType.put("NO_DISCOUNT", 1.00f);
    }
    protected int productNum;
    protected BigDecimal productPrice;

    public Product(BigDecimal productPrice, int productNum) {
        this.productPrice = productPrice;
        this.productNum = productNum;
    }

    public BigDecimal getTotalFee() {
        return productPrice.multiply(new BigDecimal(productNum));
    }

    public BigDecimal getDiscountFee(String type) {
        return this.getTotalFee().multiply(new BigDecimal(discountType.get(type)));
    }
}
