package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        StringBuilder reverseString = new StringBuilder();
        do  {
            reverseString.append(number % 10);
        } while (((number = number / 10) > 0));
        System.out.println(Integer.valueOf(reverseString.toString()));
    }
}
