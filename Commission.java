package Sales;
import java.util.*;
public class Commission {

	public static void main(String args[]) {
			
				Scanner input = new Scanner(System.in);
				System.out.println("Enter total Number of Employees : ");
				int n=input.nextInt();
				
				int sales[]=new int[n];
				
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter sales grossed by employee "+(i+1)+" : ");
					sales[i]=input.nextInt();
					sales[i]=200+(sales[i]*9)/100;
				}
				input.close();
				int mat[]=new int[9];
				
				for(int i=0;i<n;i++)
				{
					if(sales[i]<300)
					{
						mat[0]++;
					}
					
					else if(sales[i]<400)
					{	
						mat[1]++;
					}
					
					else if(sales[i]<500)
					{	
						mat[2]++;
					}
					
					else if(sales[i]<600)
					{	
						mat[3]++;
					}
					
					else if(sales[i]<700)
					{	
						mat[4]++;
					}
					
					else if(sales[i]<800)
					{	
						mat[5]++;
					}
					
					else if(sales[i]<900)
					{	
						mat[6]++;
					}
					
					else if(sales[i]<1000)
					{	
						mat[7]++;
					}
					
					else
					{	
						mat[8]++;
					}
				}
				
				System.out.println("Range of Salesmen                             Number of Salesmen");
				
				System.out.println("   $200-299                                   "+mat[0] );
				System.out.println("   $300-399                                   "+mat[1] );
				System.out.println("   $400-499                                   "+mat[2] );
				System.out.println("   $500-599                                   "+mat[3] );
				System.out.println("   $600-699                                   "+mat[4] );
				System.out.println("   $700-799                                   "+mat[5] );
				System.out.println("   $800-899                                   "+mat[6] );
				System.out.println("   $900-999                                   "+mat[7] );
				System.out.println("   Greater than $1000                         "+mat[8] );
			
			
			
			   System.out.println("Program done by P.Kripakaran(Reg No:2015103558)");
              }
	
	
}	
