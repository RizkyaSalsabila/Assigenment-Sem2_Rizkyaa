package MergeSortTest;

public class MergeSortMain24 {
    public static void main(String[] args) {
        int data[] = {10, 40, 30, 50, 70, 20, 100, 90};
        System.out.println("--- Sorting dengan merge sort ---");
        MergeSorting24 mSort = new MergeSorting24();
        System.out.println("Data Awal");
        mSort.printArray(data);
        mSort.mergeSort24(data);
        System.out.println("\nSetelah diurutkan");
        mSort.printArray(data);
    }
}