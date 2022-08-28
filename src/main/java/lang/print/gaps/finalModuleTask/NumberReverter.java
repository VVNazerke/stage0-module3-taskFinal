package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int zhuz = number / 100;

        int rem = number - zhuz * 100;

        int ondyk = rem / 10;

        rem = rem - ondyk * 10;

        System.out.println(rem * 100 + ondyk * 10 + zhuz);
    }
}
