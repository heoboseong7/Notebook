package day06;

public class ex02 {
	public static void main(String[] args)	{
		int[] n = {1 ,9 ,5 ,4 ,8 ,2 ,6};
		for(int i = 0; i < n.length; i++) {
			int min = i;
			
			for(int j = i + 1; j < n.length; j++)
				if(n[min] > n[j])
					min = j;
			
			if(i != min)
				swap(n, i, min);
		}
		for(int i = 0; i < n.length; i++)
			System.out.print(n[i]+" ");
	}
	
	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}
}