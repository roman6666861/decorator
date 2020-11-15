package CalculateImpl;

import java.util.ArrayList;
import java.util.List;

public class SquareAll implements Calculate {
    Calculate calculate;

    public SquareAll(Calculate calculate) {
        this.calculate = calculate;
    }

    @Override
    public List<Integer> numbers() {
        List<Integer> result = new ArrayList<>();
        List<Integer> numbers = calculate.numbers();
        for (Integer number : numbers) {
            result.add(number * number);
        }
        return result;
    }
}
