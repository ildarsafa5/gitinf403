public class ArrayUtils {
        public static void sort(Object[] array, ICompareObject comparator) {
            for (int i = array.length-1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    if (comparator.compare(array[j],array[j+1])>0) {
                        Object temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }
        }
}
