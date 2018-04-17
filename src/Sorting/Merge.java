package Sorting;

/**
 * Created by parker on 4/15/18.
 */
public class Merge extends Sort {

    public void sort(Comparable[] arr)
    {
        int low = 0;
        int high = arr.length - 1;

        Comparable[] aux = new Comparable[arr.length];

        sort(arr, aux, low, high);
    }

    private void sort(Comparable[] arr, Comparable[] aux, int low, int high)
    {
        if (high >= low)
        {
            return;
        }

        int mid = (high - low) / 2;
        sort(arr, aux, low, mid);
        sort(arr, aux, mid + 1, high);
        merge(arr, aux, low, mid, high);
    }

    public void merge(Comparable[] arr, Comparable[] aux, int low, int mid, int high)
    {
        assert isSorted(arr, low, mid);
        assert isSorted(arr, mid + 1, high);

        for (int k = low; k <= high; k++)
        {
            aux[k] = arr[k];
        }

        int i = low;
        int j = mid + 1;

        for (int k = low; k <= high; k++)
        {
            if (i > mid)
            {
                arr[k] = aux[j];
                j++;
            }
            else if (j > high)
            {
                arr[k] = aux[i];
                i++;
            }
            else if (less(aux[j], aux[i]))
            {
                arr[k] = aux[j];
                j++;
            }
            else
            {
                arr[k] = aux[i];
                i++;
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
