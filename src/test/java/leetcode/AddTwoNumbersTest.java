package leetcode;

import leetcode.AddTwoNumbers;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void bothSingleNodeLinkListsWithoutCarry() {
        AddTwoNumbers.ListNode list1 = constructLinkListFrom(new int[]{2});
        AddTwoNumbers.ListNode list2 = constructLinkListFrom(new int[]{3});

        AddTwoNumbers.ListNode actualList = new AddTwoNumbers().addTwoNumbers(list1, list2);
        AddTwoNumbers.ListNode expectedList = constructLinkListFrom(new int[]{5});
        assertTrue(isEqualLinkList(expectedList, actualList));
    }

    @Test
    void bothSingleNodeLinkListsWithCarry() {
        AddTwoNumbers.ListNode list1 = constructLinkListFrom(new int[]{5});
        AddTwoNumbers.ListNode list2 = constructLinkListFrom(new int[]{5});

        AddTwoNumbers.ListNode actualList = new AddTwoNumbers().addTwoNumbers(list1, list2);
        AddTwoNumbers.ListNode expectedList = constructLinkListFrom(new int[]{0, 1});
        assertTrue(isEqualLinkList(expectedList, actualList));
    }

    @Test
    void twoSameLengthLinkListsWithoutCarry() {
        AddTwoNumbers.ListNode list1 = constructLinkListFrom(new int[]{1, 2, 3});
        AddTwoNumbers.ListNode list2 = constructLinkListFrom(new int[]{2, 3, 4});

        AddTwoNumbers.ListNode actualList = new AddTwoNumbers().addTwoNumbers(list1, list2);
        AddTwoNumbers.ListNode expectedList = constructLinkListFrom(new int[]{3, 5, 7});
        assertTrue(isEqualLinkList(expectedList, actualList));
    }

    @Test
    void twoSameLengthLinkListsWithCarry() {
        AddTwoNumbers.ListNode list1 = constructLinkListFrom(new int[]{1, 2, 3});
        AddTwoNumbers.ListNode list2 = constructLinkListFrom(new int[]{9, 8, 7});

        AddTwoNumbers.ListNode actualList = new AddTwoNumbers().addTwoNumbers(list1, list2);
        AddTwoNumbers.ListNode expectedList = constructLinkListFrom(new int[]{0, 1, 1, 1});
        assertTrue(isEqualLinkList(expectedList, actualList));
    }

    @Test
    void notSameLengthLinkListsWithoutCarry() {
        AddTwoNumbers.ListNode list1 = constructLinkListFrom(new int[]{1, 2, 3});
        AddTwoNumbers.ListNode list2 = constructLinkListFrom(new int[]{1, 2});

        AddTwoNumbers.ListNode actualList = new AddTwoNumbers().addTwoNumbers(list1, list2);
        AddTwoNumbers.ListNode expectedList = constructLinkListFrom(new int[]{2, 4, 3});
        assertTrue(isEqualLinkList(expectedList, actualList));
    }

    @Test
    void notSameLengthLinkListsWithCarry() {
        AddTwoNumbers.ListNode list1 = constructLinkListFrom(new int[]{1, 2, 3});
        AddTwoNumbers.ListNode list2 = constructLinkListFrom(new int[]{2, 9});

        AddTwoNumbers.ListNode actualList = new AddTwoNumbers().addTwoNumbers(list1, list2);
        AddTwoNumbers.ListNode expectedList = constructLinkListFrom(new int[]{3, 1, 4});
        assertTrue(isEqualLinkList(expectedList, actualList));
    }

    @Test
    void testConstructLinkList() {
        AddTwoNumbers.ListNode list = constructLinkListFrom(new int[]{1, 2, 3});
        assertEquals(3, sizeOf(list));
        assertArrayEquals(new int[]{1, 2, 3}, convertLinkListToArray(list));
    }

    private int[] convertLinkListToArray(AddTwoNumbers.ListNode list) {
        List<Integer> ret = new ArrayList<>();
        while (list != null) {
            ret.add(list.val);
            list = list.next;
        }
        return ret.stream().mapToInt(i -> i).toArray();
    }

    private int sizeOf(AddTwoNumbers.ListNode list) {
        int size = 0;
        while (list != null) {
            list = list.next;
            size++;
        }
        return size;
    }

    @Test
    void testIsEqualLinkList() {
        AddTwoNumbers.ListNode list1 = constructLinkListFrom(new int[]{1, 2, 3});
        AddTwoNumbers.ListNode list2 = constructLinkListFrom(new int[]{1, 2, 3});
        assertTrue(isEqualLinkList(list1, list2));

        list1 = constructLinkListFrom(new int[]{1, 2, 3});
        list2 = constructLinkListFrom(new int[]{1, 2, 3, 4});
        assertFalse(isEqualLinkList(list1, list2));

        list1 = constructLinkListFrom(new int[]{1, 2, 3});
        list2 = constructLinkListFrom(new int[]{1, 2, 4});
        assertFalse(isEqualLinkList(list1, list2));
    }

    private boolean isEqualLinkList(AddTwoNumbers.ListNode l1, AddTwoNumbers.ListNode l2) {
        if (l1 == l2) {
            return true;
        }

        while (l1 != null || l2 != null) {
            if (l1 == null || l2 == null) {
                // Not same length
                return false;
            }

            if (l1.val != l2.val) {
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }

    private AddTwoNumbers.ListNode constructLinkListFrom(int[] arr) {
        AddTwoNumbers.ListNode re = new AddTwoNumbers.ListNode(0);
        AddTwoNumbers.ListNode p = re;
        for (int i = 0; i < arr.length; i++) {
            p.val = arr[i];
            if (i != arr.length - 1) {
                p.next = new AddTwoNumbers.ListNode(0);
                p = p.next;
            }
        }
        return re;
    }
}