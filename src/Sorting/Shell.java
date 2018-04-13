package Sorting;

/**
 * Created by parker on 4/12/18.
 */
public class Shell extends Sort {

    public void sort(Comparable[] a)
    {
        for (int i = 1; i < a.length; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                if (less(a[j], a[j - 1]))
                {
                    exchange(a, j, j - 1);
                }
                else
                {
                    break;
                }
            }
        }
    }
}
