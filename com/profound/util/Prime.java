package com.profound.util;
import java.util.Scanner;
public class Prime
{	
     public static void main(String []args)
	{    
		int n,i,j,c=0;
		System.out.println("Enter the number");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i<=n/2;i++)
		{
	
		
			if(n%2==0)
			
			c++;
			
		}
		if(c<=2)
		{
			System.out.println("PRIME NUMBER");
		}
		else
		{
			System.out.println("NOT PRIME NUMBER");
		}
        }







}
