package Syntax;

public class QSDemo {
    public static void main(String[] args) {
        char[] a = {'d', 'x', 'r', 'p', 'j', 'i'};
        int i;
        System.out.println("Source array: ");
        for (char j : a) System.out.print(j);
        System.out.println();
        QuickSort.qSort(a);
        System.out.println("Sorted array: ");
        for (char j : a) System.out.print(j);
    }
}
