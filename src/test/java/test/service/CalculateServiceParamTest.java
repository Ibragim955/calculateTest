package test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import test.exeptions.InCorrectArgumentsExeptions;

public class CalculateServiceParamTest {
    public final CalculateService calculateService = new CalculateServiceImpl();
    @ParameterizedTest
    @CsvSource({"8, 4, 12", "2, 1, 3", "4, 4, 8"})
    public void shouldReturnResult5WithPlus3and5(int num1, int num2, int expected) {
        int result = calculateService.sum(num1, num2);
        Assertions.assertEquals(result, expected);
    }
    @ParameterizedTest
    @CsvSource({"8, 4, 4", "2, 1, 1", "4, 4, 0"})
    public void shouldReturnResult6WithMinus9and6(int num1, int num2, int expected) {
        int result = calculateService.minus(num1, num2);
        Assertions.assertEquals(result, expected);
    }
    @ParameterizedTest
    @CsvSource({"8, 4, 32", "2, 1, 2", "4, 4, 16"})
    public void shouldReturnResult4WithMultiplay2and2(int num1, int num2, int expected) {
        int result = calculateService.multiplay(num1, num2);
        Assertions.assertEquals(result, expected);
    }
    @ParameterizedTest
    @CsvSource({"8, 4, 2", "2, 1, 2", "4, 4, 1"})
    public void shouldReturnResult7WithDevide70and10(int num1, int num2, int expected) throws InCorrectArgumentsExeptions {
        int result = calculateService.devide(num1, num2);
        if (num1 != 0) {
            Assertions.assertEquals(result, expected);
        }
    }
}
