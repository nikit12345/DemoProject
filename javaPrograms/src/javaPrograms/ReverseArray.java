package javaPrograms;

public class ReverseArray {
	static int temp;
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		for(int i=a.length-1; i>=0; i--) {
			System.out.print(a[i]+" ");
		}
		System.out.println(temp);

	}

}
