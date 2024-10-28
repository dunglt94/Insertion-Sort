public class InsertionSort {
    public static void main(String[] args) {
        double[] list = {2, 6, 5, 3, 1, 9, 4.5, 6.6, 5.7, -4.5, -2, 12, 10};
        printList(list);
        insertionSort(list);
    }

    private static void printList(double[] list) {
        for (double v : list) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void insertionSort(double[] list) {
        System.out.println("bắt đầu với phần tử thứ hai của mảng vì phần tử đầu tiên " +
                "trong mảng được coi là đã được sắp xếp.");
        for (int i = 1; i < list.length; i++) {
            System.out.println("Current element: " + list[i]);
            for (int j = i; j > 0; j--) {
                if (list[j] < list[j - 1]) {
                    System.out.println("Swap " + list[j] + " with " + list[j - 1]);
                    double temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] = temp;
                }
            }
            System.out.print("List after the '" + i + "' sort: ");
            printList(list);
        }
    }
}
