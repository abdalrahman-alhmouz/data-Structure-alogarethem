package MergeSort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

public class AppTest {

    @Test
    public void mergeSortTest(){
        int[] lostNumbers = {8, 4, 23, 42, 16, 15};
        App mergeSort = new App();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {4, 8, 15, 16, 23, 42};
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }


    @Test
    public void mergeSort2Test(){
        int[] lostNumbers = {8};
        App mergeSort = new App();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {8};
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }

    @Test
    public void mergeSort3Test(){
        int[] lostNumbers = {8, 10, 20, -15};
        App mergeSort = new App();
        int[] sortedNumbers = mergeSort.mergeSort(lostNumbers);
        int[] sortedLostNumbers = {-15, 8, 10, 20};
        assertArrayEquals(sortedLostNumbers, sortedNumbers);
    }

}