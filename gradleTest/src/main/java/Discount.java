import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by izzy on 16-7-10.
 */
public class Discount {
    public static String discountBarStr="ITEM000000,ITEM000001";
    public static Map<String, Float> discountTypeMap= new HashMap<String, Float>();
    static{
        discountTypeMap.put("FIVE_PERCENT_DISCOUNT", 0.95f);
        discountTypeMap.put("TEN_PERCENT_DISCOUNT", 0.90f);
        discountTypeMap.put("NO_DISCOUNT", 1.00f);
    }

    public static BigDecimal getDiscountFee(Product product, int num, String discountType) {
        return product.getPrice().multiply(new BigDecimal(num)).multiply(new BigDecimal(discountTypeMap.get(discountType)));
    }
    public static boolean isDiscount(Product product,String discountBarStr){
        ArrayList list = new ArrayList();
        String[] str = discountBarStr.split(discountBarStr);
        for (String s:str){
            list .add(s);
        }
        return new ArrayList<String>().contains(product.getBarCode());
    }
}
