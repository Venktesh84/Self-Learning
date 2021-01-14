package other;

import java.util.Arrays;

public class Array {

	static Bubblesort bs = new Bubblesort();
	static Insertionsort is = new Insertionsort();
	static Selectionsort ss = new Selectionsort();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num[] = {3,9,5,12,4,15,2,0};
		System.out.println(Arrays.toString(num));
		ss.sort(num);
		System.out.println(Arrays.toString(num));
	}

}
