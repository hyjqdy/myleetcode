package leetcode;

//给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
//
// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
//
// 你可以假设 nums1 和 nums2 不会同时为空。
//
// 示例 1:
//
// nums1 = [1, 3]
//nums2 = [2]
//
//则中位数是 2.0
//
//
// 示例 2:
//
// nums1 = [1, 2]
//nums2 = [3, 4]
//
//则中位数是 (2 + 3)/2 = 2.5
//
// Related Topics 数组 二分查找 分治算法

public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size1 = nums1.length;
        int size2 = nums2.length;
        int size3 = size1 + size2;
        int[] nums3 = new int[size3];
        for (int i = 0, j = 0, k = 0; i < size1 || j < size2;) {
            if (i == size1) {
                nums3[k++] = nums2[j++];
                continue;
            }

            if (j == size2) {
                nums3[k++] = nums1[i++];
                continue;
            }

            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }

        int middle = size3 / 2;
        if (size3 % 2 == 0) {
            return (double)(nums3[middle] + nums3[middle - 1]) / 2;
        } else {
            return nums3[middle];
        }
    }
}
