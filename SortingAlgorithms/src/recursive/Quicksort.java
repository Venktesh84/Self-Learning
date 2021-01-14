package recursive;

import java.util.Arrays;

public class Quicksort {
	static void sort(int[] num) {
		System.out.println(Arrays.toString(num));
		qs(num,0,num.length-1);
		System.out.println(Arrays.toString(num));
	}

	private static void qs(int[] num, int l, int r) {
		// TODO Auto-generated method stub
		if(l>=r) {
			return;
		}
		int pivot= partition(num,l,r);
		qs(num,l,pivot-1);
		qs(num,pivot+1,r);
	}

	private static int partition(int[] num, int l, int r) {
		// TODO Auto-generated method stub
		int pivot=num[r];
		int i=l-1;
		
		for(int j=l;j<r;j++) {
			if(num[j]<pivot) {
				i=i+1;
				int temp = num[i];
				num[i]=num[j];
				num[j]=temp;
			}
		}
		int temp=num[i+1];
		num[i+1]=num[r];
		num[r]=temp;
		return i+1;
	}
}
