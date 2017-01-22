/* problem:find third smallest element
   author: Mohammad shahzeb 
   time complexity: thetha(n) 			*/
import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		for(int i=0; i<array.length; i++)
			array[i]=sc.nextInt();
		
		for(int i=0; i<3; i++){
			for(int j=array.length-1; j>i; j--){
				if(array[j] < array[j-1]){
					int temp=array[j];
					array[j]=array[j-1];
					array[j-1]=temp;
				}
			}
		}
		System.out.println("third smallest element="+array[2]);
	}
}
