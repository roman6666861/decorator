package CalculateImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Range implements Calculate {
    private final int a;
    private final int b;

    public Range(int a, int b) {
        this.a = a;
        this.b = b;
    }
    @Override
    public List<Integer> numbers() {
        Integer[] array = new Integer[this.b -this.a];
        for (int i = 0; i < array.length; i++) {
            array[i] = this.a + i;
        }
        return Arrays.asList(array);
    }
}
