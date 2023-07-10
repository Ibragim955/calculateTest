package test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import test.exeptions.InCorrectArgumentsExeptions;

public class CalculateServiceTest {
    public final CalculateService calculateService = new CalculateServiceImpl();
    @Test
    public void shouldReturnResult5WithPlus3and5() {
        int result = calculateService.sum(2, 3);
        Assertions.assertEquals(result, 5);
    }

    @Test
    public void shouldReturnResult6WithMinus9and6() {
        int result = calculateService.minus(9, 3);
        Assertions.assertEquals(result, 6);
    }

    @Test
    public void shouldReturnResult4WithMultiplay2and2() {
        int result = calculateService.multiplay(2, 2);
        Assertions.assertEquals(result, 4);
    }

    @Test
    public void shouldReturnResult7WithDevide70and10() throws InCorrectArgumentsExeptions {
        int result = calculateService.devide(70, 10);
        Assertions.assertEquals(result, 7);
    }


}
