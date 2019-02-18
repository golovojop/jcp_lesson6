import java.util.Arrays;

public class ArrayUtil {

    /**
     * @param array     исходный массив
     * @param separator элемент, отделяющий хвостовую часть
     * @return хвост исходного массива после сепаратора
     * @throws RuntimeException
     */
    public static int[] extractTail(int[] array, int separator) throws RuntimeException {

        int index = array.length - 1;

        for (; index >= 0; index--) {
            if (array[index] == separator) break;
        }

        if (index < 0) {
            throw new RuntimeException(String.format("Array has no element %d", separator));
        } else if (index == (array.length - 1)) {
            return new int[]{};
        } else {
            return Arrays.copyOfRange(array, index + 1, array.length);
        }
    }

    /**
     * @param array    исходный массив
     * @param patterns искомые значения
     * @return результат поиска
     */
    public static boolean containsAll(int[] array, int[] patterns) {

        if (patterns.length > array.length) return false;

        boolean resultSearch = true;

        for (int p : patterns) {
            boolean resultScan = false;
            for (int a : array) {
                if (a == p) {
                    resultScan = true;
                    break;
                }
            }
            resultSearch = resultSearch && resultScan;
            if (!resultSearch) break;
        }
        return resultSearch;
    }
}
