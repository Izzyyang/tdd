import static org.junit.Assert.assertTrue;
import java.math.BigDecimal;
import static org.junit.Assert.assertEquals;
/**
 * Created by izzy on 16-7-7.
 */
public class Test {

    private final int COCOLA_NUM = 3;
    private final BigDecimal COCOLA_PRICE = new BigDecimal(3);

    private final int BADMINTON_NUM = 5;
    private final BigDecimal BADMINTON_PRICE = new BigDecimal(1);

    private final int APPLE_NUM = 2;
    private final BigDecimal APPLE_PRICE = new BigDecimal(5.5);

    private final String FIVE_PERCENT_DISCOUNT = "FIVE_PERCENT_DISCOUNT";
    private final String  TEN_PERCENT_DICOUNT= "TEN_PERCENT_DISCOUNT";
    private final String  NO_DISCOUNT = "NO_DISCOUNT";
    @org.junit.Test
    public void should_return_totallfee_cocola() throws Exception {
        assertTrue(new Cocola(COCOLA_NUM,COCOLA_PRICE).getTotalFee().equals(new BigDecimal(9)));
    }
    @org.junit.Test
    public void should_return_discountfee_cocola() throws Exception {
        BigDecimal b = new Cocola(COCOLA_NUM,COCOLA_PRICE).getDiscountFee(FIVE_PERCENT_DISCOUNT);
        double f = b.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
        assertTrue(new BigDecimal(f).compareTo(new BigDecimal(8.55)) == 0);
    }

    //羽毛球
    @org.junit.Test
    public void should_return_totallfee_badminton() throws Exception {
        assertTrue(new Badminton(BADMINTON_NUM,BADMINTON_PRICE).getTotalFee().equals(new BigDecimal(5)));
    }
    @org.junit.Test
    public void should_return_discountfee_badminton() throws Exception {
        BigDecimal b = new Badminton(BADMINTON_NUM,BADMINTON_PRICE).getDiscountFee(TEN_PERCENT_DICOUNT);
        double f =  b.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
        assertTrue(new BigDecimal(f).compareTo(new BigDecimal("4.5")) == 0);
    }
    //苹果
    @org.junit.Test
    public void should_return_totallfee_apple() throws Exception {
        assertTrue(new Apple(APPLE_NUM,APPLE_PRICE).getTotalFee().compareTo(new BigDecimal(11)) == 0);
    }
    @org.junit.Test
    public void should_return_discountfee_apple() throws Exception {
        assertTrue(new Apple(APPLE_NUM,APPLE_PRICE).getDiscountFee(NO_DISCOUNT).compareTo(new BigDecimal(11)) == 0);
    }
}
