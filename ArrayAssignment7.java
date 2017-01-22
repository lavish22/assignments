//problem: to reverse the array
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		int[] array= new int[11];
		int start=0,end=array.length-1;
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<array.length; i++)
			array[i]=sc.nextInt();

		for(int i=0; i<(array.length/2); i++)
			swap(array,start++,end--);

		for(int temp:array)System.out.print(temp+" ");
	}	
	static void swap(int[] array, int a, int b){
		int temp=array[a];
		array[a]=array[b];
		array[b]=temp;
	}
}	
