package part4;

import java.util.ArrayList;
import java.util.Random;

public class MergeSort {

	public static ArrayList<Integer> mergeSort(ArrayList<Integer> arr){
		
		if( arr.size() ==1) {
			return arr;
		}else {
			
			ArrayList<Integer> firstHalf = mergeSort(  
					new ArrayList<>(arr.subList(0, arr.size()/2)));
			ArrayList<Integer> secondHalf = mergeSort(  
					new ArrayList<>(arr.subList(arr.size()/2, arr.size())));
			
			System.out.println("merging " + firstHalf + " " +secondHalf);
			
			ArrayList<Integer> result = new ArrayList<>();
			int firstIndex = 0;
			int secondIndex = 0;
			
			while(firstIndex < firstHalf.size() 
					&& secondIndex< secondHalf.size()) {
				if(firstHalf.get(firstIndex) <=
						secondHalf.get(secondIndex)) {
					result.add(firstHalf.get(firstIndex));
					firstIndex++;
				}else {
					result.add(secondHalf.get(secondIndex));
					secondIndex++;
				}
			}
			
			while( firstIndex < firstHalf.size()) {
				result.add(firstHalf.get(firstIndex));
				firstIndex ++;
			}
			
			while(secondIndex < secondHalf.size()) {
				result.add(secondHalf.get(secondIndex));
				secondIndex++;
			}
		
			
			
			return result;
		}
		
	}
	
	
	public static void main(String[] args) {
		Random rnd = new Random();
		int testSize= 16;
		ArrayList<Integer> input = new ArrayList<>();
		for (int i = 0; i < testSize; ++i) {
			input.add(rnd.nextInt(100));
		}

		System.out.println(input);
		input = mergeSort(input);
		
		System.out.println(input);

	}

}
