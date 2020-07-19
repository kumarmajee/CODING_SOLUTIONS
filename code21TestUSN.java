import java.util.Scanner;

class  testRegis
{
	static int test(String str,int n)
	{
		int temp=0;
		if(str.length()!=10)
		{
			System.out.println("invalid USN");
		}
		char arr[]=new char[10];
		for(int i=0;i<10;i++)
		{
			arr[i]=str.charAt(i);
		}
		
		if(arr[0]=='1' || arr[0]=='2')
		{
			if((arr[1]>='A' || arr[1]<='Z') && (arr[2]>='A' && arr[2]<='Z'))
			{
				if((arr[3]>=47 || arr[3]<=56) && (arr[4]>=47 || arr[4]<=56))
				{
					if((arr[5]=='C' && arr[6]=='S') || 
							(arr[5]=='I' && arr[6]=='S') || 
							(arr[5]=='E' && arr[6]=='C') || 
							(arr[5]=='M' && arr[6]=='E'))
					{
						if(arr[7]>=47 || arr[7]<=56 )
						{
							if(arr[8]>=47 || arr[8]<=56 )
							{
								if(arr[9]>=47 || arr[9]<=56 )
								{
									temp=1;
								    
								}
								
							}
						}
					}
				}
			}
			
		}
		
		if(temp==0)
			return 0;
		else if(temp==1)
			return 1;
		return 0;
	}
}

public class code21TestUSN 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the usn registration:(only 10 digits)");
		String str=sc.next();
		int n=0;
		testRegis b1=new testRegis();
		int c=b1.test(str,n);

		
		if(c==0)
			System.out.println("Failure");
		else
			System.out.println("Success");


		
		
	}


}
