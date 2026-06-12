package dmtr.ivnv;

public class Tasks {
    static int sumInt (int firstOperand, int secondOperand) {
        return firstOperand + secondOperand;
    }

    static int diffInt (int firstOperand, int secondOperand) {
        return firstOperand - secondOperand;
    }

    static int multiplyInt (int firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    static int divInt (int firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }

    static double divDouble (double firstOperand, int secondOperand) {
        return firstOperand / secondOperand;
    }

    static double multiplyDouble (double firstOperand, int secondOperand) {
        return firstOperand * secondOperand;
    }

    static boolean isGreater (int firstOperand, int secondOperand) {
        return firstOperand > secondOperand;
    }

    static boolean isLess (int firstOperand, int secondOperand) {
        return firstOperand < secondOperand;
    }

    static boolean isGreaterOrEqual (int firstOperand, double secondOperand) {
        return firstOperand >= secondOperand;
    }

    static boolean isEqual (int firstOperand, double secondOperand) {
        return firstOperand == secondOperand;
    }

    static boolean isLessOrEqual (int firstOperand, double secondOperand) {
        return firstOperand <= secondOperand;
    }

    static short shortOverflow (short firstOperand, short secondOperand) {
        return (short) (firstOperand + secondOperand);
    }

}
