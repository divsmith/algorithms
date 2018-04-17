package Sorting;

/**
 * Created by parker on 4/15/18.
 */
public class Merge extends Sort {

    public void sort(Comparable[] arr)
    {

    }

    private Boolean isSorted(Comparable[] arr)
    {
        for (int i = 1; i < arr.length; i++)
        {
            if (less(arr[i], arr[i - 1]))
            {
                return false;
            }
        }

        return true;
    }
}
