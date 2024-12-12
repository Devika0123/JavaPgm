package Array;

import java.util.Scanner;

public class Multidimension2 {

	public static void main(String[] args) {
		// Username password
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the usernameand password");
		String [][]arr=new String[3][2];
		
		for(int i=0;i<3;i++)
		{
		for(int j=0;j<2;j++)
		{
			arr[i][j]=sc.next();
		}
		System.out.println();
		
		}
		System.out.println("username and password:\n");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		

	}

}


	


