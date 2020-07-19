/*Use arrays to structure the raw data and to perform data comparison &
operations
Given a sentence which consists of alphabets [a-zA-Z], digits [0-9], “,” and “.”.
Write a method which returns a string after reversing only the alphabets [a-zA-Z] in a sentence which
is passed as an argument the method.
Note: reversing has to be done word-by-word. Example: if sentence contains “Hello World”, the
reversed sentence will be “dlroW olleH”
*/

import java.util.Scanner;

public class code22revtheword {
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		String[] words=str.split(" ");
		
	
		String reverseWord="";
		int k=1;
		
		for(String w:words)
		{
			
			for(int i=0;i<=w.length()-1;i++)
			{
				
				if(w.charAt(i)>=47 && w.charAt(i)<=56)
				{
					reverseWord=reverseWord+w.charAt(i);
					
				}
				else if(k==1)
				{
				
					for(int j=w.length()-1;j>=0;j--)
					{
						if((w.charAt(j)>='A' && w.charAt(j)<='Z')||(w.charAt(j)>='a' && w.charAt(j)<='z'))
						{
							reverseWord=reverseWord+w.charAt(j);
							
							
				
						}
				
						
					}
					k=0;
				
				}
				
			}
			k=1;
			reverseWord=reverseWord+" ";
			
			
			
		}
		
		
		System.out.print(reverseWord);
		
	}
}
	
	


