package myPackage;
import java.util.*;
public class My1stProject {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number which you want the MagicSquare for");
		int input=in.nextInt();
		if(input==4)
			{
				
				{
				System.out.println("Enter the number of diagnols/row/column Sum");
				int input4=in.nextInt();
				if(input4>20)
					{
						int [][]array4 =
						{
						{input4-20 ,1 ,12 ,7},
						{11 ,8 ,input4-21 ,2},
						{5 ,10 ,3 ,input4-18},
						{4 ,input4-19 ,6 , 9}
						};
						 	{
						 		System.out.println("Your Desired Magic Square is");
							   // Loop through all rows
						        for (int[] row : array4)
						 
						            // converting each row as string
						            // and then printing in a separate line
					 System.out.println(Arrays.toString(row));
						 	}
				}
				else
					System.out.println("Enter the sum more than 20");
				}
			}
		else if(input==3)
			{
			int [][] array3 =
				{ 
				{2 ,7 ,6},
				{9 ,5 ,1},
				{4 ,3 ,8}
				};
			   {
				   // Loop through all rows
			        for (int[] row : array3)
			 
			            // converting each row as string
			            // and then printing in a separate line
			            System.out.println(Arrays.toString(row));
			   }
			 
			}
		else 
			System.out.println("Wrong Input -> Input numbers between 3 to 5");
		
	}

}
