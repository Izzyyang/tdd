import java.math.BigDecimal;
import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by izzy on 16-7-10.
 */
public class TestPrint {
    @org.junit.Test
    public void printListInfo(){
        Product apple = new Product("苹果",new BigDecimal(5.5));
        String info = PrintInfo.print(apple,1);
        assertEquals("名称：苹果，数量：1个，单价：5.5（元），小计：5.5（元）", info);
    }
}
