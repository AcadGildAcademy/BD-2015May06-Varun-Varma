package Exceptionhandling;

public class ArrayIndex {

	public static void main(String[] args) {

		 try{
			
			 int a[]={1,2,3};
			 for( int i = 0 ; i < a.length +1 ; i++ ){ 
					
					System.out.print(a[i] + "\t");
				}
	
			 }
			 
			 catch(ArrayIndexOutOfBoundsException e){
				 
				 System.out.println("Array index out of bound");
			 }
	}

}
