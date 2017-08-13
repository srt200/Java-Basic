import java.util.Scanner;
public class SinFunction
{
	static int n,x,factroial=1;
	static  double power;
	static double sum;

	public static void main(String []args)
	
	{     
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Sin Function:'x-x^2/2!+x^3!.......n'");
	      System.out.println("Enter The no.(n)to which you want to execute the Sin Function");
	      n=sc.nextInt();
              if(n<=0)
		{
		 System.out.println("The number must be Greater than 0");
		}
              else{
	      System.out.println("Enter the value (x) on which the operation to be performed");
	      
	       x=sc.nextInt();
		for(int i=1;i<=n;i=i+2)
		{
                   power=Math.pow(x,i);
		    factroial=factroial*i;	
		}
			
                   sum +=(power/factroial);
			sum=sum*(-1);	
		
		
		System.out.println("Sin sum is"+sum);	
		

	         }

}



}
