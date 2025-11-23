import java.util.Scanner;

public class OddEven
{
 public static void main (String [] args)
 {
  int n;
  Scanner s = new Scanner(System.in);
  System.out.println("Enter the Number to Check :");
  n = s.nextInt();
  if (n%2==0)
	{
	 System.out.println("The Given Number is EVEN NUMBER !-->"+n);
	}
  else 
	{
	 System.out.println("The Given Number is ODD NUMBER --> "+n);
	}
  }
}

	