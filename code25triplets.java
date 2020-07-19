/* Use arrays to structure the raw data and to perform data comparison &
operations
Triplets are a set of three similar things.
Complete the function to print all the triplets <A, B, C> such that A+B = C
void printTriplets(int[ ] data) {
}
Example Sample Input Sample Output
1
data ={2,3,4,5,7} <2,3,5>
<2,5,7>
<3,4,7>
2
data = {1,2,3,4,5,7,9} <1,2,3>
<1,3,4>
<1,4,5>
<2,3,5>
<2,5,7>
<3,4,7>
<4,5,9>
*/

import java.util.Scanner;

public class code25triplets 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int[] data=new int[n];
		for(int i=0;i<n;i++)
		{
			data[i]=sc.nextInt();
		}
		System.out.println("data=");
		for(int i=0;i<n;i++)
		{
			System.out.print(data[i]+" ");
		}
		
		printTriplets(data);
	}
	
	public static void printTriplets(int[] data)
	{
		int len=data.length;
		int res[]=new int[3];
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				for(int k=j+1;k<len;k++)
				{
					if(data[i]+data[j]==data[k])
					{
						System.out.println("<"+data[i]+","+data[j]+","+data[k]+">"+"\n");
					}
				}
			}
		}
	}

}
