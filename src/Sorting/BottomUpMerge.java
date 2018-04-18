package Sorting;

/**
 * Created by parker on 4/17/18.
 */
public class BottomUpMerge extends Sort {

    public void sort(Comparable[] arr)
    {
        Comparable[] aux = new Comparable[arr.length];
        int mergeSize = 1;

        while (mergeSize <= ((arr.length) /2))
        {
            for (int i = 0; i < (arr.length - mergeSize); i += mergeSize * 2)
            {
                merge(arr, aux, i, i + (mergeSize / 2), i + (mergeSize * 2) - 1);
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
}
