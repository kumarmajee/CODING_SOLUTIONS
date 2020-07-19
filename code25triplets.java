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
