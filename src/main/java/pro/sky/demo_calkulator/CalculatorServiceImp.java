package pro.sky.demo_calkulator;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImp implements CalculatorService {
    @Override
    public String sumNumbers(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "неправильнный ввод, попробуй еще раз";
        } else {
            return num1 + " + " + num2 + " = " + (num1 + num2);
        }
    }

    @Override
    public String subtractNumbers(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "неправильнный ввод, попробуй еще раз";
        } else {
            return num1 + " - " + num2 + " = " + (num1 - num2);
        }
    }

    @Override
    public String multiplyNumbers(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "неправильнный ввод, попробуй еще раз";
        } else {
            return num1 + " * " + num2 + " = " + (num1 * num2);
        }
    }

    @Override
    public String divideNumbers(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "неправильнный ввод, попробуй еще раз";
        } else if (num2 == 0) {
            return "Деление на 0 невозможно.";
        } else {
            return num1 + " / " + num2 + " = " + (num1 / num2);
        }
    }
}
