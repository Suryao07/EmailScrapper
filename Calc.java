import java.util.Scanner;

public class Calc
{
 public static void main (String [] args)
  {
   Double n1,n2,result;
   char o;
   Scanner s = new Scanner(System.in);
   System.out.println("Enter the operators '+,-,*,/'");
   o=s.next().charAt(0);
   System.out.println("Enter the Number 1 :");
   n1=s.nextDouble();
   System.out.println("Enter the Number 2 :");
   n2=s.nextDouble();
   switch (o)
	{
	 case '+':
		{
		 result = n1 + n2;
		 System.out.println("Sum ="+result);
		 break;
		}
	case '-':
		{
		 result = n1 - n2;
		 System.out.println("Diff ="+result);
		 break;
		}
	case '*':
		{
		 result = n1 * n2;
		 System.out.println("Multiply ="+result);
		 break;
		}	
	case '/':
		{
		 result = n1 / n2;
		 System.out.println("Divison ="+result);
		 break;
		}	 
	default :
		{
		 System.out.println("Please Choose the given operators only !");
		}
	}
   }
}