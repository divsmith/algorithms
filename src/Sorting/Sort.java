package Sorting;

import java.util.Comparator;

/**
 * Created by parker on 4/8/18.
 */
public abstract class Sort {

    public abstract void sort(Comparable[] arr);

    public abstract void sort(Object[] arr, Comparator comparator);

    protected boolean less(Comparator c, Object v, Object w)
    {
        return c.compare(v, w) < 0;
    }

    protected void exchange(Object[] arr, int i, int j)
    {
        Object swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }

    protected static ComparableComparison BY_COMPARABLE = new ComparableComparison();

    protected static class ComparableComparison implements Comparator<Comparable>
    {
        public int compare(Comparable v, Comparable w)
        {
            return v.compareTo(w);
        }
    }
}
