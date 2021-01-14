package recursive;

import java.util.Arrays;

public class array {
	static Quicksort qs = new Quicksort();
	static Mergesort ms = new Mergesort();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {3,9,5,12,4,15,2,0};
		//qs.sort(num);
		ms.sort(num);
	}

}
