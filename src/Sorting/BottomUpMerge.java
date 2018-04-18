package Sorting;

/**
 * Created by parker on 4/17/18.
 */
public class BottomUpMerge extends Sort {

    public void sort(Comparable[] arr)
    {

    }

    private void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high)
    {
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
