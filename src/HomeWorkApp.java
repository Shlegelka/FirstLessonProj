public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println("Hello World");

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {

        int a = 10;
        int b = 20;
        int sum = a + b;

        if (sum >= 0)
        {
            System.out.println("Сумма положительная");
        }
        else if (sum < 0)
        {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor()
    {
        int value = 10;
        if (value <= 0)
        {
            System.out.println("Красный");
        }
        else if (0 < value && value <= 100)
        {
            System.out.println("Жёлтый");
        }
        else if (100 < value)
        {
            System.out.println("Зелёный");
        }
    }
    public static void compareNumbers()
    {
        int a = 2;
        int b = 1;
        if (a >= b)
        {
            System.out.println("a >= b");
        }
        else if (a < b)
        {
            System.out.println("a < b");
        }
    }
}








