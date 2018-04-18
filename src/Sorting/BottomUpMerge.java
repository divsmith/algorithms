package Sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by parker on 4/17/18.
 */
public class BottomUpMerge extends Sort {

    public void sort(Comparable[] arr)
    {
        Comparable[] aux = new Comparable[arr.length];
        int mergeSize = 1;

        while (mergeSize <= (arr.length - 1))
        {
            for (int i = 0; i < (arr.length - mergeSize); i += mergeSize * 2)
            {
                int low = i;
                int mid = i + (mergeSize - 1);
                int high = i + (mergeSize * 2) - 1;

                if (high > arr.length - 1)
                {
                    high = arr.length - 1;
                }

                merge(arr, aux, low, mid, high);
            }

            mergeSize *= 2;
        }
    }

    private void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high)
    {
        assert isSorted(arr, low, mid);
        assert isSorted(arr, mid + 1, high);

        int i = low;
        int j = mid + 1;

        for (int k = low; k <= high; k++)
        {
            aux[k] = arr[k];
        }

        for (int k = low; k <= high; k++)
        {
            if (i > mid)
            {
                arr[k] = aux[j++];
            }
            else if (j > high)
            {
                arr[k] = aux[i++];
            }
            else if (less(aux[j], aux[i]))
            {
                arr[k] = aux[j++];
            }
            else
            {
                arr[k] = aux[i++];
            }
        }

        assert isSorted(arr, low, high);
    }

    private Boolean isSorted(Comparable[] arr, int low, int high)
    {
        for (int i = low + 1; i <= high; i++)
        {
            if (less(arr[i], arr[i - 1]))
            {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) throws FileNotFoundException
    {
        Scanner scanner = new Scanner(new File(args[0]));
        int size = scanner.nextInt();
        BottomUpMerge merge = new BottomUpMerge();

        System.out.println("Total Ints: " + size);

        Integer[] unsorted = new Integer[size];
        for (int i = 0; i < size && scanner.hasNextInt(); i++)
        {
            unsorted[i] = scanner.nextInt();
        }

        BigDecimal start = new BigDecimal(System.currentTimeMillis());
        merge.sort(unsorted);
        BigDecimal end = new BigDecimal(System.currentTimeMillis());

        BigDecimal time = (end.subtract(start).divide(new BigDecimal(1000)));
        System.out.println("Sort Time: " + time);
    }
}
