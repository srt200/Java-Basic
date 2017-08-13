import java.util.Scanner;
public class FlipCoin
{
	public static void main(String []args)
	{
		int i,a,n,head=0,tail=0;
		System.out.println("Enter the time the coin to be flipped");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		 {
		    a=(int)(Math.random()*2)+1;
		
		if(a==1)
		  {
			//System.out.println("Heads");
			head++;
		  }
		else
		  {
			//System.out.println("Tails");
			tail++;
		  }

                  }
		 
			double hp=(head*100)/n;
			double tp=(tail*100)/n;
			System.out.println("Head Count is:"+head);
			System.out.println("Tail Count is:"+tail);
			System.out.println("\nHeads percentage:"+hp+"%");
			System.out.println("\nTail percentage:"+tp+"%");

														 
}


}
