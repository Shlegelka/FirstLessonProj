public class HomeWork {
    public static void main(String[] args) {
        System.out.println("Hello word!");
    }
    public static boolean isSumBetween10And20(int x1, int x2)
    {
        int sum = x1 + x2;
        return (10 < sum && sum <= 20);
    }
    public static void isPositiveOrNegative(int x)
    {
        if (x >= 0);
        {
            System.out.println("Число положительное!");
        }
    }

    {
        System.out.println("Число отрицательное!");
    }

    public static boolean isNegative(int x)
    { return x < 0; }

    public static void printWordNTimes (String word, int times) {
        for (int i = 0; i < times; i++)
        {
            System.out.println(word);
        }
    }
}
