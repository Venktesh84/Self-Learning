package other;

import java.util.Arrays;

public class Insertionsort {

	public void sort(int[] num) {
		// TODO Auto-generated method stub
		for(int i=0;i<num.length;i++) {
			int j=i;
			while(j>0 && num[j-1]>num[j]) {
				int temp = num[j];
				num[j]=num[j-1];
				num[j-1]=temp;
				j=j-1;
				System.out.println(Arrays.toString(num));
			}
		}
	}

}
