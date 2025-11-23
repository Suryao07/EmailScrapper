import java.util.Scanner;

public class SumOfNum
{
 public static void main(String [] args)
 {
  int i,sum=0;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the Number :");
  int num = s.nextInt();
  for (i=1;i<=num;i++)
	{
	  sum = sum+i;
	}
  System.out.println("Sum ="+sum);
 }
}