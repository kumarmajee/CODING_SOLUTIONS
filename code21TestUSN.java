/* Use arrays to structure the raw data and to perform data comparison &
operations
In an online application, a university would like to validate the university seat number (USN) entered
by its student.
Example: A sample USN looks like: 1DS09CS010
Following are the constraints to enter registration number:
 Each USN must be length of 10 characters
 1st character must be digit and have value either '1' or '2'
 2nd and 3rd characters must be upper case letters
 4th and 5th characters must be digits and can have values between 0-9
 6th and 7th characters must be upper case letters and can have combination any of following
substring: CS, IS,EC and ME
 8th,9th and 10th characters must be digits and can have values between 0-9
 Create class called TestUSN which has main() method to:
 Initialize USN variable with string value
 Validate USN against above constraints
 Print "Success" or "Failure" message based on result of validation
*/

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
