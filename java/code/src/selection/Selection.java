package selection;

import tools.Tool;

/**
 * @author w
 */
public class Selection {
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++) {
                if (Tool.less(a[j], a[min])) {
                    min = j;
                }
            }
            Tool.exchange(a, i, min);
        }
    }
    public static void main(String[] args) {
        Comparable[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        sort(array);
        assert Tool.isSorted(array);
        Tool.show(array);
    }
}
