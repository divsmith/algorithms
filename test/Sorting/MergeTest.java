package Sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/15/18.
 */
class MergeTest {

    @Test
    void test_sort_works()
    {
        Integer[] arr = {7, 9, 16, 15, 14, 8, 2, 10, 1, 13, 3, 11, 12, 5, 4, 6};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        Merge merge = new Merge();
        merge.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }
}