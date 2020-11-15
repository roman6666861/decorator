package CalculateImpl;

import java.util.ArrayList;
import java.util.List;

public class OddOnly implements Calculate {
    Calculate calculate;

    public OddOnly(Calculate calculate) {
        this.calculate = calculate;
    }
    @Override
    public List<Integer> numbers() {
        List<Integer> numbers = calculate.numbers();
        List<Integer> result = new ArrayList<>();
        for (Integer number : numbers) {
            if (number % 2 == 0)
                result.add(number);
        }
        return result;
    }
}
