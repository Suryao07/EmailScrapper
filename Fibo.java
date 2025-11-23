class Fibo 
{
public static void main(String [] args)
{
 int i = 1 , n = 10 , sum = 0 , fir=0 , sec=1;
 System.out.println("Fibonacci Series till "+n+" Terms");
 while (i<=n)
  {
   System.out.println(fir+",");
   sum = fir + sec;
   fir=sec;
   sec = sum;
   i++;
   }
  }
}