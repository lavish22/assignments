//problem: to find missing number in integer array of 1 to 100
public class ArrayAssignment5{
	public static void main(String[] args){
		int[] intary = new int[100];
		int duplicate=(int)(Math.random()*100); //btw 0 to 99[both inclusive]
		int sum=0;
//		System.out.println("duplicate value:"+duplicate+"\n");
		for(int i=0,k=1; i<intary.length; i++,k++){
			if(k==duplicate){
				intary[i]=intary[i+1]=duplicate;
				i++;
				sum=sum+2*duplicate;
				continue;
			}
			sum=sum+k;
			intary[i]=k;
		}
		for(int temp: intary)System.out.print(temp+" ");
		System.out.println("\nduplicate value:"+(sum-4950));
	}
}	
