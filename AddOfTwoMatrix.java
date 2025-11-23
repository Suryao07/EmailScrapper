import java.util.Scanner;
public class AddOfTwoMatrix
        {
            public static void main (String [] args)
            {
                Scanner in = new Scanner(System.in);
                int row , col , i, j;
                System.out.println("Enter the Numbers of rows and Columns :");
                row = in.nextInt();
                col = in.nextInt();
                int first[][] = new int[row][col];
                int sec[][] = new int[row][col];
                int sum[][] = new int[row][col];
                System.out.println("Enter the elements of first matrix : ");
                for (i=0;i<row;i++)
                {
                    for(j=0;j<col;j++)
                    {
                        first[i][j]=in.nextInt();
                    }
                }
                System.out.println("Enter the element of Second Matrix");
                for (i=0;i<row;i++)
                {
                    for (j=0;j<col;j++)
                    {
                        sec[i][j]=in.nextInt();
                    }
                }
                for (i=0;i<row;i++)
                {
                    for (j=0;j<col;j++)
                    {
                        sum[i][j]=first[i][j] + sec[i][j];
                    }
                }
                System.out.println("Sum of matrix = ");
                for (i=0;i<row;i++)
                {
                    for(j=0;j<col;j++)
                    {
                        System.out.print(sum[i][j]+"\t");

                    }
                    System.out.println();
                }
            }
        }

