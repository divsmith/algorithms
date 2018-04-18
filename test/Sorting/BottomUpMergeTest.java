package Sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by parker on 4/17/18.
 */
class BottomUpMergeTest {

    @Test
    void test_sort_works_2_elements()
    {
        Integer[] arr = {16, 15};
        Integer[] sorted = {15, 16};

        BottomUpMerge merge = new BottomUpMerge();
        merge.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }

    @Test
    void test_sort_works_3_elements()
    {
        Integer[] arr = {16, 15, 14};
        Integer[] sorted = {14, 15, 16};

        BottomUpMerge merge = new BottomUpMerge();
        merge.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }

    @Test
    void test_sort_works_4_elements()
    {
        Integer[] arr = {16, 15, 3, 2};
        Integer[] sorted = {2, 3, 15, 16};

        BottomUpMerge merge = new BottomUpMerge();
        merge.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }

    @Test
    void test_sort_works_8_elements()
    {
        Integer[] arr = {16, 15, 3, 2, 8, 9, 11, 10};
        Integer[] sorted = {2, 3, 8, 9, 10, 11, 15, 16};

        BottomUpMerge merge = new BottomUpMerge();
        merge.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }

    @Test
    void test_sort_works_15_elements()
    {
        Integer[] arr = {7, 9, 16, 15, 14, 8, 2, 10, 1, 13, 3, 12, 5, 4, 6};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 15, 16};

        BottomUpMerge merge = new BottomUpMerge();
        merge.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }

    @Test
    void test_sort_works()
    {
        Integer[] arr = {7, 9, 16, 15, 14, 8, 2, 10, 1, 13, 3, 11, 12, 5, 4, 6};
        Integer[] sorted = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};

        BottomUpMerge merge = new BottomUpMerge();
        merge.sort(arr);

        Assertions.assertTrue(Arrays.equals(arr, sorted));
    }
}