package Sorting;

import java.util.Comparator;

/**
 * Created by parker on 4/29/18.
 */
public class Quick extends Sort {

    @Override
    public void sort(Object[] arr, Comparator comparator) {

    }

    private int partition(Comparable[] a, int low, int high, Comparator c)
    {
        int i = low;
        int j = high + 1;

        while (true)
        {
            while (less(c, a[++i], a[low]))
            {
                if (i == high)
                {
                    break;
                }
            }

            while (less(c, a[low], a[--j]))
            {
                if (j == low)
                {
                    break;
                }
            }

            if (i >= j)
            {
                break;
            }

            exchange(a, i, j);
        }

        exchange(a, low, j);

        return j;
    }
}
