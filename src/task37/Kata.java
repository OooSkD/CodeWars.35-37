package task37;
/*
DESCRIPTION:
    You will be given an array of numbers.
    You have to sort the odd numbers in ascending order while leaving the even numbers at
    their original positions.
 */
import java.util.Arrays;

public class Kata {
    public static int[] sortArray(int[] array) {
        int[] odd = new int[array.length];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                odd[j] = array[i];
                j++;
            }
        }
        Arrays.sort(odd);
        j=array.length - j;
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) {
                array[i] = odd[j];
                j++;
            }
        }
        return array;
    }
}
