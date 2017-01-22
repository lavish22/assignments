import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
                int[] arry = null;      //declared array
                arry = new int[5];      //made array object with 5 int values
                System.out.println("enter "+arry.length+" values");

                for(int i=0; i<arry.length ; i++)
                        arry[i]=sc.nextInt();
		
	//	assignment1(arry);
	//	assignment2(arry,3);
	//	assignment3(arry);for(int temp : arry)System.out.println(temp);	
		assignment4(arry);
	}
	static public void assignment1(int[] arry){
		int min,max;
		min=max=arry[0];
		
		for(int i=0; i<arry.length ;i++){
			if(min > arry[i]) 
				min= arry[i];
			if(max < arry[i])
				max= arry[i];
		}
		System.out.println("min element= "+min+"\nmax element= "+max);
	}
	static public void assignment2(int[] ary,int x){
		boolean flag=false;
		for(int i=0; i<ary.length; i++){
			if(x==ary[i]){
				flag=true;
				break;
			}
		}
		if(flag)System.out.println("FOUND");
		else    System.out.println("NOT	FOUND");
	}
	static public int[] assignment3(int[] arry){
		int i,temp,j;
		for(i=1; i<arry.length; i++){
			temp=arry[i];
			j=i;
			while(j>0 && temp<arry[j-1]){
				arry[j]=arry[j-1];
				j--;
			}
			arry[j]=temp;
		}
		return arry;
	}
	static public void assignment4(int[] arry){
		arry=assignment3(arry);	
		int[] occur= new int[arry.length];
		int index=0,counter=0;
		for(int temp : arry){
			counter=0;
			for(int i=0 ; i<arry.length; i++)
				if(temp==arry[i])counter++;		
			occur[index++]=counter;
		}
		System.out.println("Array_element  number_of_occurence");
		for(int i=0; i<arry.length; i++){
			while(i<arry.length-1 && arry[i]==arry[i+1])i++;
			System.out.printf("%8d  %18d \n",arry[i],occur[i]);
		}
	}
}
