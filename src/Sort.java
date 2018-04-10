/**
 * Created by parker on 4/8/18.
 */
public abstract class Sort {

    public abstract void sort(Comparable[] arr);

    protected boolean less(Comparable v, Comparable w)
    {
        return v.compareTo(w) < 0;
    }

    protected void exchange(Comparable[] arr, int i, int j)
    {
        Comparable swap = arr[i];
        arr[i] = arr[j];
        arr[j] = swap;
    }
}
