import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilTest {

    @Test
    public void testExtractTail1() {
        int[] array = new int[] {1,5,5,3,2,1,0,4,5,6,7};
        int[] expected = new int[]{5,6,7};
        Assert.assertArrayEquals(expected, ArrayUtil.extractTail(array, 4));
    }
    @Test
    public void testExtractTail2() {
        int[] array = new int[] {1,5,5,4,3,2,1,0,5,6,7};
        int[] expected = new int[]{3,2,1,0,5,6,7};
        Assert.assertArrayEquals(expected, ArrayUtil.extractTail(array, 4));
    }
    @Test
    public void testExtractTail3() {
        int[] array = new int[] {1,5,5,3,2,1,0,4,5,4,7};
        int[] expected = new int[]{7};
        Assert.assertArrayEquals(expected, ArrayUtil.extractTail(array, 4));
    }
    @Test
    public void testExtractTail4() {
        int[] array = new int[] {4,5,5,3,2,1,0,5,6,7};
        int[] expected = new int[]{5,5,3,2,1,0,5,6,7};
        Assert.assertArrayEquals(expected, ArrayUtil.extractTail(array, 4));
    }
    @Test(expected = RuntimeException.class)
    public void testExtractTail5() {
        int[] array = new int[] {1,5,5,3,2,1,0,5,6,7};
        int[] expected = new int[]{5,6,7};
        ArrayUtil.extractTail(array, 4);
    }
    @Test
    public void testExtractTail6() {
        int[] array = new int[] {1,5,5,3,2,1,0,5,6,7,4};
        int[] expected = new int[]{};
        Assert.assertArrayEquals(expected, ArrayUtil.extractTail(array, 4));
    }

    @Test
    public void testContainsAll1(){
        int[] array = new int[] {1,5,5,3,2,1,0,5,6,7,4};
        int[] patterns = new int[]{1,5};

        Assert.assertTrue(ArrayUtil.containsAll(array, patterns));
    }

    @Test
    public void testContainsAll2(){
        int[] array = new int[] {1,5,5,3,2,1,0,5,6,7,4};
        int[] patterns = new int[]{9,5};

        Assert.assertFalse(ArrayUtil.containsAll(array, patterns));
    }

    @Test
    public void testContainsAll3(){
        int[] array = new int[] {1,5,5,3,2,1,0,5,6,7,4};
        int[] patterns = new int[]{6,7,4};

        Assert.assertTrue(ArrayUtil.containsAll(array, patterns));
    }

}
