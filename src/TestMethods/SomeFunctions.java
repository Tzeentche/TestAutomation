package TestMethods;

public class SomeFunctions {

    public static void main(String[] args) {

        int a = 13;
        int b = 3;
        int sum;

        sum = getSumm(a, b);

        System.out.println(sum);

        sum = getSumm(10, 143);

        System.out.println(sum);

        System.out.println(getSumm(13, 44));

        System.out.println();

        showSum(10, 51, 77);

        saySmthng();

        sayHello("ILYA");

        showSumToPerson("Ilysha", 3, 5, 999);
    }

    protected static int getSumm(int x, int y) {

        int sum;
        sum = x + y;

        return sum;
    }

    private static void showSum(int x, int y, int z) {

        int sum = x + y + z;

        System.out.println(sum);
    }

    public static void saySmthng() {

        System.out.println();
        System.out.print("Say");
        System.out.print(" : ");
        System.out.println("Hello");
    }

    private static void sayHello(String name) {

        System.out.println("Hello, " + name + "!");
    }

    static void showSumToPerson(String name, int a, int b, int c) {

        System.out.println("Start of programm!");
        sayHello(name);

        showSum(a, b, c);

        System.out.println("End of programm!");
    }
}
