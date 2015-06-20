import java.util.Scanner;

/**
 * 
 */

/**
 * @author varunverma
 *
 */
public class MatrixMultiplication {
	public static void main(String args[])
	{
		int a[][]=new int[3][3];
		int b[][]=new int[3][3];
		int c[][]=new int[3][3];
		System.out.println("Enter the first matrix:");
		Scanner input=new Scanner(System.in);
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
			    a[i][j]=input.nextInt();
 
		System.out.println("Enter the second matrix:");
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				b[i][j]=input.nextInt();
		System.out.println("Matrix multiplication is as follows:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=0;
				for(int k=0;k<3;k++)
				{
				  c[i][j]+=a[i][k]*b[k][j];
	           			}
			}
	    	}
	    	for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
	 		{
	     		System.out.print(a[i][j]+"\t");
    			}
    			System.out.println("\n");
        		}
        		System.out.println("\n");
        		for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
	 		{
	     		System.out.print(b[i][j]+"\t");
    			}
    			System.out.println("\n");
        		}	
        		System.out.println("\n");
	    	for(int i=0;i<3;i++)
			{
			for(int j=0;j<3;j++)
	 		{
	     		System.out.print(c[i][j]+"\t");
    			}
    			System.out.println("\n");
        		}		   	
	}
}
