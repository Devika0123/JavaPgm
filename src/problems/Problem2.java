package problems;

public class Problem2 {

	public static void main(String[] args) {
		int row =5;
		for(int i=1;i<=row;i++) 
		{
			for(int j=row;j>=i;j--)
			{
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		

	}

}
