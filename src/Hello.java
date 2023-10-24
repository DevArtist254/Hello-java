public class Hello {
    public static void main(String[] args) {
        double num1 = 20.00; double num2 = 80.00;

        double total1 = (num1 + num2) * 100.00;

        double rem = total1 % 40.00;

        boolean isZero = rem == 0.00;

        if (!isZero) System.out.println("got some reminder");
    }
}
