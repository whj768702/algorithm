package insertion;

import tools.Tool;

/**
 * @author w
 */
public class Insertion {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++) {
            for (int j = i; j > 0 && Tool.less(a[j], a[j - 1]); j--) {
                Tool.exchange(a, j, j - 1);
            }
        }
    }
    public static void main(String[] args) {
        Comparable[] array = {1,2,4,6,3};
        sort(array);
        assert Tool.isSorted(array);
        Tool.show(array);
    }
}
