package lab24;
import java.util.Scanner;
public class QuickSort {
    public static void QuickSort(String[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            QuickSort(arr, low, pivotIndex - 1); 
            QuickSort(arr, pivotIndex + 1, high);
        }
    }
    public static int partition(String [] arr, int low, int high) {
        String  pivot = arr[high];
        int i = low - 1; 
        for (int j = low; j < high; j++) {
            if (arr[j].compareTo(pivot)<=0) {  
                i++; 
                swap(arr, i, j);  
            }
        }
        swap(arr, i + 1, high);  
        return i + 1;  
    }
    public static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of strings:");
		int n = sc.nextInt();
		sc.nextLine();
		String arr[] = new String[n];
		System.out.println("Enter the string:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextLine();
			}
        QuickSort(arr, 0, arr.length - 1);
        System.out.println();
        System.out.println("Sorted array:");
        for (String str : arr) {
        	System.out.println(str);
        	}
        sc.close();
    }
}