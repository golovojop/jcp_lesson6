
import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import org.junit.runners.Parameterized;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class ArrayUtilParameterizedTest {
    private int[] inputArray;
    private int inputSeparator;
    private int[] expectedArray;

    public ArrayUtilParameterizedTest(int[] inputArray, int inputSeparator, int[] expectedArray) {
        this.inputArray = inputArray;
        this.inputSeparator = inputSeparator;
        this.expectedArray = expectedArray;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> generateInput() {
        return Arrays.asList(new Object[][] {
                {new int[]{1,5,5,3,2,1,0,4,5,6,7}, 4, new int[]{5,6,7}},
                {new int[]{1,5,5,3,2,1,0,5,4,6,7}, 4, new int[]{6,7}},
                {new int[]{1,5,5,3,2,1,0,4,5,6,4}, 4, new int[]{}},
                {new int[]{1,5,4,5,3,2,1,0,5,6,7}, 4, new int[]{5,3,2,1,0,5,6,7}}
        });
    }

    @Test
    public void paramTest(){
        Assert.assertArrayEquals(expectedArray, ArrayUtil.extractTail(inputArray, inputSeparator));
    }
}
