package Duplicate;
import java.util.*;
public class DuplicateElimination {

	public static void main(String[] args) {
		
			int a[]=new int[5];
			int b=0,c,counter=0;
			Scanner input=new Scanner(System.in);
			for(int i=0;i<5;i++)
			{
				System.out.println("Enter the number : ");
				c=input.nextInt();
				if(c>9&&c<101)
				{
				for(int j=0;j<i;j++)
				{
					if(a[j]==c)
					{
						b=1;
					}
					
					else
					{
						continue;
					}
				}
				if(b > 0)
				{
					continue;
				}
				else
				{
					a[i]=c;
					counter++;
					for(int j=0;j<counter;j++)
					System.out.println(a[j]);
				}
				}
				else
				{
					System.out.println("Enter a number between 10 and 100 :");
					i=i-1;
					
				}
		
			}

		}
	
	}

	
	
	   


       