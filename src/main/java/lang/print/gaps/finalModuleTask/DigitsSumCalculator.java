package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int myndyk = number / 1000;

        int rem = number - myndyk * 1000;

        int zhuzdyk = rem / 100;

        rem = rem - zhuzdyk * 100;

        int ondyk = rem / 10;

        rem = rem - ondyk * 10;

        System.out.println(rem + ondyk + zhuzdyk + myndyk);

    }
}
