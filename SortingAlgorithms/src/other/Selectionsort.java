package other;

public class Selectionsort {

	public void sort(int[] num) {
		// TODO Auto-generated method stub
		for(int i=0; i<num.length-1; i++) {
			int min = i;
			for(int j=i+1; j<num.length; j++) {
				if(num[j]<num[min]) {
					min=j;
				}
				if(min!=j) {
					int temp = num[j];
					num[j]=num[min];
					num[min]=temp;
				}
			}
		}
	}

}
