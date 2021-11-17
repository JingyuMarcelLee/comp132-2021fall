package part4;

import java.util.Arrays;
import java.util.Random;

public class SelectionSort {

	public static void sSort(int[] arr) {

		for (int targetIndex = 0; targetIndex < arr.length; ++targetIndex) {
			int smallest = arr[targetIndex];
			int indexOfSmallest = targetIndex;
			for (int i = targetIndex + 1; i < arr.length; ++i) {
				if (arr[i] < smallest) {
					smallest = arr[i];
					indexOfSmallest = i;
				}
			}

			// swap
			int temp = arr[targetIndex];
			arr[targetIndex] = smallest;
			arr[indexOfSmallest] = temp;
			//System.out.println(Arrays.toString(arr));

		}
	}

	public static void main(String[] args) {
		
		Random rnd = new Random();
		for(int testSize = 50; testSize < 10000; testSize+=50){
			int[] arr = new int[testSize];
			for (int i = 0; i < arr.length; ++i) {
				arr[i] = rnd.nextInt(100);
			}
			long totalTime =0 ;
			int trialCount = 100;
			for( int trial = 0; trial < trialCount; ++trial) {
				long timeBefore = System.nanoTime();
				sSort(arr);
				long timeAfter = System.nanoTime();
				totalTime += timeAfter-timeBefore;
			}
			System.out.println(testSize + "\t" + (totalTime/trialCount));
			
		}
		

	}

}
