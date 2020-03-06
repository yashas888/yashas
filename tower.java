

import java.util.Scanner;

public class tower 
{

	public void solveTowersOfHanoi(int n, String source, String aux, String dest)
	{
		
		if(n==1)
		{
			System.out.println(source+" --> "+dest);
			return;
		}
		
		
		solveTowersOfHanoi(n-1, source, dest, aux);
		
		
		System.out.println(source+" --> "+dest);
		
		
		solveTowersOfHanoi(n-1, aux, source, dest);
		
	}
	
	public static void main(String args[])
	{
		tower obj = new tower();
		
		System.out.println("Enter number of disks :- ");
	    
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		
		System.out.println("Move disks as below illustration.");
		obj.solveTowersOfHanoi(n, "A", "B", "C");
		
	}	
}
