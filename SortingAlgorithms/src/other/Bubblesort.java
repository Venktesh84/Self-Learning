package other;

public class Bubblesort {

	public void sort(int[] num) {
		// TODO Auto-generated method stub
		for(int i=0; i<num.length; i++) {
			for(int j=i+1; j<num.length; j++) {
				if(num[j]<num[i]) {
					int temp = num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
	}

}
