package MergeSort;

import org.junit.Assert;
import org.junit.Test;

public class MergeSortTest {

    @Test
    public void testMergeSort() {
        App arraySort = new App();
        int[] testArr = new int[]{1, 5, 0, 2, 6, 92, 10, 30};
        int[] expectedArr = new int[]{0, 1, 2, 5, 6, 10, 30, 92};



        arraySort.mergesort(testArr);
        System.out.println(testArr[3]);
        System.out.println(testArr[4]);
        Assert.assertArrayEquals("testArr should equal [2, 3, 5, 6, 7, 8, 9, 10]", expectedArr,
                testArr);


    }
}
