9. Can you change size of array once created?
9. no, in order to reduce size of array 
   we can make another reference to array of same type and required size and then we c   an copy the required parts of array.After that we can withdraw previous reference a   nd then garbage collector will do the rest of work.
   eg.   int[]  reference1;		//reference to integer array
	 reference1 = new int[5];	//make it point to array object of 5 integers
	 int[]  reference2;		//made another reference to int array
         reference2= new int[reference1.length-1]; //reference2 is 1 less in size 
         System.arrayCopy(reference1,0,reference2,reference1.length-1);
	//this will copy elements from 1 to n-1, where n=size of array

10. Can you store String in an array of Integer in Java? compile time error or runtime exception?
10. NumberFormatException will arrive at runtime.
