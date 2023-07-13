package test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import test.exeptions.InCorrectArgumentsExeptions;
import test.service.CalculateService;

@RestController
@RequestMapping("/calculate")
public class CalculateController {
    private final CalculateService calculateService;

    public CalculateController(CalculateService calculateService) {
        this.calculateService = calculateService;
    }

    @GetMapping
    public String welcome() {
        return calculateService.sayHello();
    }
    @GetMapping("/plus")
    public int plus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateService.sum(number1, number2);
    }
    @GetMapping("/minus")
    public int minus(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateService.minus(number1, number2);
    }
    @GetMapping("/multiplay")
    public int multiplay(@RequestParam("num1") int number1, @RequestParam("num2") int number2) {
        return calculateService.multiplay(number1, number2);
    }
    @GetMapping("/devide")
    public int devide(@RequestParam("num1") int number1, @RequestParam("num2") int number2) throws InCorrectArgumentsExeptions {
        return calculateService.devide(number1, number2);
    }
}