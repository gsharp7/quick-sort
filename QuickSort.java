import java.util.*;

public class QuickSort {
	public static void main(String[] args) {
		int[] x = {3,5,7,6,2};
		System.out.println(Arrays.toString(x));
		int low = 0;
		int high = x.length - 1;
		quickSort(x, low, high);
		//System.out.println(Arrays.toString(x));
	}
	public static void quickSort(int[] arr, int low, int high) {
          System.out.println("\n" + Arrays.toString(arr));
		if (arr == null || arr.length == 0)
			return;
		if (low >= high)
			return;
		// pick the pivot
		//int middle = low + (high - low) / 2;
		int pivot = arr[high];
		// make left < pivot and right > pivot
		int i = low, j = high;
		while (i <= j) {
			while (arr[i] < pivot) {
				i++;
			}
			while (arr[j] > pivot) {
				j--;
			}
			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}

          System.out.println("i: " + i + " j: " + j);
		// recursively sort two sub parts
		if (low < j)
			quickSort(arr, low, j);
		if (high > i)
			quickSort(arr, i, high);
	}
}
