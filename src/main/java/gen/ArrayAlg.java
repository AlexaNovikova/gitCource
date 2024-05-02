package gen;

public class ArrayAlg {
    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static <T> int countElements(T... a) {
        return a.length;
    }

    public static <T extends Comparable<T>> T getMin(T... a) {
        if (a == null || a.length == 0) {
            return null;
        } else {
            T min = a[0];
            for (int i = 0; i < a.length; i++) {
                if (a[i].compareTo(min) < 0) {
                    min = a[i];
                }
            }
            return min;
        }
    }


}
