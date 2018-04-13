package Sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/12/18.
 */
class ShellTest {
    @Test
    void test_sort_works()
    {
        Integer[] arr = {7, 9, 8, 2, 1, 3, 5, 4, 6};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Shell shell = new Shell();
        shell.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }
}