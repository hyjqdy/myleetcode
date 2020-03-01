package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMedianSortedArraysTest {

    @Test
    void testFirstArrayIsLonger() {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result);
    }

    @Test
    void testSecondArrayIsLonger() {
        int[] nums1 = new int[] {2};
        int[] nums2 = new int[] {1, 3};
        double result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        assertEquals(2.0, result);
    }

    @Test
    void testSameLengthArray() {
        int[] nums1 = new int[] {1, 3};
        int[] nums2 = new int[] {2, 4};
        double result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        assertEquals(2.5, result);

        nums1 = new int[] {1};
        nums2 = new int[] {2};
        result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        assertEquals(1.5, result);

        nums1 = new int[] {1, 2};
        nums2 = new int[] {2, 3};
        result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        assertEquals(2, result);
    }

    @Test
    void testAllItemsOfFirstArrayAreBigger() {
        int[] nums1 = new int[] {1, 3, 5};
        int[] nums2 = new int[] {-1, -2};
        double result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        assertEquals(1, result);
    }

    @Test
    void testAllItemsOfSecondArrayAreBigger() {
        int[] nums1 = new int[] {-1, -2};
        int[] nums2 = new int[] {1, 3, 5};
        double result = new FindMedianSortedArrays().findMedianSortedArrays(nums1, nums2);
        assertEquals(1, result);
    }
}