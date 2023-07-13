package test.service;

import test.exeptions.InCorrectArgumentsExeptions;

public interface CalculateService {
    String sayHello();

    int sum(int number1, int number2);

    int minus(Integer number1, Integer number2);

    int multiplay(Integer number1, Integer number2);

    int devide(Integer number1, Integer number2) throws InCorrectArgumentsExeptions;
}
