package lab01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiffUtilTest {
    @Test
    public void testAllSameNum() {
        final int[] arr = new int[] { 3, 3, 3 };
        assertEquals(0, DiffUtil.findSmallestDiff(arr));
    }

    @Test
    public void testNegAndPos() {
        final int[] arr = new int[] { 52, 4, -8, 0, -17 };
        assertEquals(4, DiffUtil.findSmallestDiff(arr));
    }

    @Test
    public void testTooSmallArray() {
        final int[] arr = new int[0];
        assertThrows(IllegalArgumentException.class, () -> { DiffUtil.findSmallestDiff(arr); });
    }

    @Test
    public void testFirstNegRestPos() {
        final int[] arr = new int[] {-3, 9, 100, 45, 99, 105};
        assertEquals(1, DiffUtil.findSmallestDiff(arr));
    }
}
