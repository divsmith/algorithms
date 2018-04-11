package Sorting;

import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigDecimal;
import java.util.Scanner;

/**
 * Created by parker on 4/10/18.
 */
public class Insertion extends Sort{

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
