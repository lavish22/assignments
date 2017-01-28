import java.util.*;	
public class StringAssignments{
	public static void main(String[] args){
	//	Scanner sc = new Scanner(System.in);
	//	String st= new String();
	//	System.out.println("enter the string input");
	//	st=sc.nextLine();
	//	System.out.println(countVowels(st));
	//	StringAssignments.palindrome(st);
	//	System.out.println(myReverse(st));
		System.out.println(circularString("abcd","acdb"));
		
		
	}
	static int countVowels(String st){		//Assignment1
		st.toLowerCase();
		int counter=0;
		for(int i=0; i<st.length(); i++){
			char ch = st.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
				counter++;
		}
	return counter;
	}
	static void  palindrome(String st){ 		//Assignment2
		boolean flag=true;
		for(int i=0,j=st.length()-1; i<st.length()/2; i++,j--){
			if( st.charAt(i)!=st.charAt(j) ){
				flag=false;
				break;
			}
		}
		if(flag)System.out.println("PALINDOME STRING");
		else    System.out.println("NOT PALINDROME STRING");	
	}
	static String myReverse(String st){		//Assignment3
		StringBuilder sb = new StringBuilder();
		for(int i=st.length()-1; i>=0; i--)
			sb=sb.append(st.charAt(i));
	return sb.toString();
	}
	static boolean circularString(String s1,String s2){	//Assignment4
		if( s1.length()!=s2.length() )return false;
		String st=s1.concat(s1);
		int i=0,n=s2.length();
		while(i <= n){
			String test=st.substring(i,i+n);
			if( s2.equals(test) ){
				return true;	
			}i++;	
		}
	return false;	
	} 
	
} 
