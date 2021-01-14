package recursive;

import java.util.Arrays;

public class Mergesort {

	public void sort(int[] num) {
		// TODO Auto-generated method stub
		if(num.length==1) {
			return;
		}
		System.out.println(Arrays.toString(num));
		int[] num1 = new int[num.length/2];
		int[] num2 = new int[num.length/2];
		for(int i=0;i<num.length;i++) {
			if(i<num1.length) {
				num1[i]=num[i];
			}
			else {
				num2[i-num1.length]=num[i];
			}
		}
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
		
		sort(num1);
		sort(num2);
		
		merge(num1,num2);
	}

	private void merge(int[] num1, int[] num2) {
		// TODO Auto-generated method stub
		int[] fnum = new int[num1.length+num2.length];
		
		while(num1!=null && num2!=null) {
			if(num1[0]>num2[0]) {
				fnum[fnum.length-1]=num2[0];
				System.out.println(num2[0]);
				//num2[0]=num2[1];
			}
			else {
				fnum[fnum.length-1]=num1[0];
				System.out.println(num1[0]);
				//num1[0]=num1[1];
			}
		}
		
		while(num1!=null) {
			fnum[fnum.length-1]=num1[0];
			num1[0]=num1[1];
		}
		
		while(num2!=null) {
			fnum[fnum.length-1]=num2[0];
			num2[0]=num2[1];
		}
	}

}
