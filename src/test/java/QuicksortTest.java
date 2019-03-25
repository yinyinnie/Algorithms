import com.github.yinyinnie.algorithms.Quicksort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class QuicksortTest {

    private static final int [] a1 = null;
    private static final int [] a2 = new int[] {};
    private static final int [] a3 = new int[] {1};
    private static final int [] a4 = new int[] {2,1};
    private static final int [] a5 = new int[] {2,2,2};
    private static final int [] a6 = new int[] {1,2,3,4,5};
    private static final int [] a7 = new int[] {5,4,3,2,1};
    private static final int [] a8 = new int[] {4, 1, 6, 2, 3, 2};

    private Quicksort quicksort = new Quicksort();

    @Test
    public void test_qsort1() {
        assertArrayEquals(null, quicksort.qsort1(a1));
        assertArrayEquals(new int[] {}, quicksort.qsort1(a2));
        assertArrayEquals(new int[] {1}, quicksort.qsort1(a3));
        assertArrayEquals(new int[] {1, 2}, quicksort.qsort1(a4));
        assertArrayEquals(new int[] {2, 2, 2}, quicksort.qsort1(a5));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, quicksort.qsort1(a6));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, quicksort.qsort1(a7));
        assertArrayEquals(new int[] {1, 2, 2, 3, 4, 6},quicksort.qsort1(a8));
    }

    @Test
    public void test_partition() {
        assertEquals(1, quicksort.partition(a4, 0, 1));
    }
}
