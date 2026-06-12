package dmtr.ivnv;

public class Main {
    public static void main(String[] args) {
        int a = 12;
        int b = 4;
        double c = 3;
        double d = 4;

        short shortRightBorder = 32767;
        short increment = 1;

        System.out.println("[0] Сумма" + " " + a + " и " + b + ":");
        System.out.println(Tasks.sumInt(a, b));

        System.out.println("[0] Разница" + " " + a + " и " + b + ":");
        System.out.println(Tasks.diffInt(a, b));

        System.out.println("[0] Умножение" + " " + a + " и " + b + ":");
        System.out.println(Tasks.multiplyInt(a, b));

        System.out.println("[0] Целочисленное отношение" + " " + a + " и " + b + ":");
        System.out.println(Tasks.divInt(a, b));

        System.out.println("[1] Вещественное отношение" + " " + c + " и " + b + ":");
        System.out.println(Tasks.divDouble(c, b));

        System.out.println("[1] Вещественное умножение" + " " + Tasks.divDouble(c, b) + " и " + b + ":");
        System.out.println(Tasks.multiplyDouble(Tasks.divDouble(c, b), b));

        System.out.println("[2] " + a + " больше " + b + "?");
        System.out.println(Tasks.isGreater(a, b));

        System.out.println("[2] " + a + " меньше " + b + "?");
        System.out.println(Tasks.isLess(a, b));

        System.out.println("[2] " + b + " >= " + d + "?");
        System.out.println(Tasks.isGreaterOrEqual(b, d));

        System.out.println("[2] " + b + " = " + d + "?");
        System.out.println(Tasks.isEqual(b, d));

        System.out.println("[2] " + b + " <= " + d + "?");
        System.out.println(Tasks.isLessOrEqual(b, d));

        System.out.println("[4]");
        System.out.println("short " + shortRightBorder + " + " + "short " + increment + " = " + Tasks.shortOverflow(shortRightBorder, increment));
        System.out.println("Short overflow detected :)");
    }
}
