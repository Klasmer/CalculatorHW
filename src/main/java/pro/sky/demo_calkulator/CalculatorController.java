package pro.sky.demo_calkulator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/calculator")
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @GetMapping("/plus")
    public String sumNumbers(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.sumNumbers(num1, num2);
    }
    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.subtractNumbers(num1, num2);
    }
    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam(value = "num1", required = false) Integer num1, @RequestParam(value = "num2", required = false) Integer num2) {
        return calculatorService.multiplyNumbers(num1,num2);
    }
    @GetMapping("/divide")
    public String divideNumbers(@RequestParam(value = "num1", required = false) Double num1, @RequestParam(value = "num2", required = false) Double num2) {
        return calculatorService.divideNumbers(num1,num2);
    }
}
