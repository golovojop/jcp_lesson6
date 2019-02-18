public class MainClass {

    public static void main(String[] args) {
        int[] array = {1,2,1,4,5,6,3};

        // Извлечь хвост
        int[] extracted = ArrayUtil.extractTail(array, 4);

        // Проверить наличие эелементов в массиве array
        boolean contains = ArrayUtil.containsAll(array, new int[]{1, 2});

        System.out.println(extracted.length);
        System.out.println(contains);
    }
}
