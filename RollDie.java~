import java.util.Scanner;
public class RollDie
{
	public static void main(String []args)
	{	int i;
                int array[]=new int[6];
		System.out.println("Enter the no. of times you want a die to roll");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
		int r=(int)(Math.random()*6)+1;
		
		switch(r)
		{
			case 1:
			array[0]++;
			break;
			case 2:
			array[1]++;
			break;
			case 3:
			array[2]++;
			break;
			case 4:
			array[3]++;
			break;
			case 5:
			array[4]++;
			break;
			case 6:
			array[5]++;
			break;
		}
		}
		int greater=array[0];
		for(i=0;i<array.length;i++)
		{
			if(array[i]>greater)
			{
				greater=array[i];
			}
		}		
			
		System.out.println("No. Repeated most is:"+greater);
	}


}
