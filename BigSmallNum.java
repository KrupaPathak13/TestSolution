/* Biggest and smallest number in an array
 Write a program to print the biggest and smallest number in the array.

Input: arr[] = {1, 2, 3, 4, 5}
Output: Maximum is: 5
Minimum is: 1

Input: arr[] = {5, 3, 7, 4, 2}
Output: Maximum is: 7
Minimum is: 2*/
import java.util.*;
public class BigSmallNum
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many Numbers:");
        int n=sc.nextInt();
        int arrnum[] = new int[n];
        int big,small;
        System.out.println("Enter " + n + " Numbers:");
        for(int i=0;i<n;i++)
        {
		    arrnum[i]=sc.nextInt();
		}
		big=arrnum[0];
		small=arrnum[0];
		for(int i=0;i<n;i++)
		{
			if(big < arrnum[i])
			{
				big=arrnum[i];
			}
			if(small > arrnum[i])
			{
				small=arrnum[i];
			}
		}
		System.out.println("Maximum is : " + big);
		System.out.println("Minimum is : " + small);

	}
}