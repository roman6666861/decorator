import CalculateImpl.Calculate;
import CalculateImpl.OddOnly;
import CalculateImpl.Range;
import CalculateImpl.SquareAll;

public class Main {
    public static void main(String[] args) {
        Calculate oddOnly = new SquareAll(new OddOnly(new Range(5, 15)));
        System.out.println(oddOnly.numbers());
    }
}
