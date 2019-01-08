import com.github.yinyinnie.algorithms.InsertSort;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class InsertSortTest {

    private static final int [] a1 = null;
    private static final int [] a2 = new int[] {};
    private static final int [] a3 = new int[] {1};
    private static final int [] a4 = new int[] {2,1};
    private static final int [] a5 = new int[] {2,2,2};
    private static final int [] a6 = new int[] {1,2,3,4,5};
    private static final int [] a7 = new int[] {5,4,3,2,1};
    private static final int [] a8 = new int[] {4, 1, 6, 2, 3, 2};


    private InsertSort insertSort = new InsertSort();

    @Test
    public void testInsertSort1() {
        assertArrayEquals(null, insertSort.insertSort1(a1));
        assertArrayEquals(new int[] {}, insertSort.insertSort1(a2));
        assertArrayEquals(new int[] {1}, insertSort.insertSort1(a3));
        assertArrayEquals(new int[] {1, 2}, insertSort.insertSort1(a4));
        assertArrayEquals(new int[] {2, 2, 2}, insertSort.insertSort1(a5));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, insertSort.insertSort1(a6));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, insertSort.insertSort1(a7));
        assertArrayEquals(new int[] {1, 2, 2, 3, 4, 6}, insertSort.insertSort1(a8));
    }

    @Test
    public void testInsertSort2() {
        assertArrayEquals(null, insertSort.insertSort2(a1));
        assertArrayEquals(new int[] {}, insertSort.insertSort2(a2));
        assertArrayEquals(new int[] {1}, insertSort.insertSort2(a3));
        assertArrayEquals(new int[] {1, 2}, insertSort.insertSort2(a4));
        assertArrayEquals(new int[] {2, 2, 2}, insertSort.insertSort2(a5));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, insertSort.insertSort2(a6));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, insertSort.insertSort2(a7));
        assertArrayEquals(new int[] {1, 2, 2, 3, 4, 6}, insertSort.insertSort2(a8));
    }

    @Test
    public void testInsertSort3() {
        assertArrayEquals(null, insertSort.insertSort3(a1));
        assertArrayEquals(new int[] {}, insertSort.insertSort3(a2));
        assertArrayEquals(new int[] {1}, insertSort.insertSort3(a3));
        assertArrayEquals(new int[] {1, 2}, insertSort.insertSort3(a4));
        assertArrayEquals(new int[] {2, 2, 2}, insertSort.insertSort3(a5));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, insertSort.insertSort3(a6));
        assertArrayEquals(new int[] {1, 2, 3, 4, 5}, insertSort.insertSort3(a7));
        assertArrayEquals(new int[] {1, 2, 2, 3, 4, 6}, insertSort.insertSort3(a8));
    }
}
