public class ArmstrongNo {

    protected static boolean findArmstrong(int number) {
        int temp = number;
        int digits = 0;
        int sum = 0;
        int rem = 0;
        digits = (int) Math.log10(number) + 1;
        while (temp != 0) {
            rem = temp % 10;
            sum = sum + (int) Math.pow(rem, digits);
            temp = temp / 10;
        }

        if (sum == number) {
            return true;
        }
        return false;
    }
}
