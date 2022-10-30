package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int sum = 0;
        do {
            sum += number % 10;
        } while((number = number / 10) > 0);
        System.out.println(sum);
    }
}
