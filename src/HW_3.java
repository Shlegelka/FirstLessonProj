import java.util.Arrays;

public class HW_3 {
    public static void main(String[] args) {
        System.out.println("Hello world");
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };

        System.out.println(Arrays.toString(array));
           }
    public static void changeZeroesAnd0nes(int[] inputArray)
    {
        for (int i = 0; i < inputArray.length; i++)
    {
        inputArray[i] = (inputArray[i] == 1) ? 0 : 1;
       }
    }

    public static void fillArrayWithSequence(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = (i+i);
        }
    }

   static void doubleNumbersLessThanSixIn(int[] inputArray)
   {
       for (int i = 0; i < inputArray.length; i++)
       {
           inputArray[i] = (inputArray[i] < 6) ? (inputArray[i] * 2) : inputArray[i];
       }
   }

   public static void fillDiagonalsWith0nes(int[][] square)
   {
       for (int i = 0; i < square.length; i++)
           square[i][i] = 1;
   }

   public static int[] getNewArrayWith(int initialValue, int lenght)
   {
   int[] result = new int[lenght];
   for (int i = 0; i < result.length; i++)
   {
       result[i] = initialValue;
   }
   return result;
   }
}


