package Sorting;

/**
 * Created by parker on 4/12/18.
 */
public class Shell extends Sort {

    public void sort(Comparable[] a)
    {
        int h = 1;

        for (int i = 1; i < a.length; i += h)
        {
            for (int j = i; j >= 1; j -= h)
            {
                if (less(a[j], a[j - h]))
                {
                    exchange(a, j, j - h);
                }
                else
                {
                    break;
                }
            }
        }
    }
}
