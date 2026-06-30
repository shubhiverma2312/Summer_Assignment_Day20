import java.util.*;
class q77
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter row size of 1st matrix:");
        int a=sc.nextInt();
        System.out.print("Enter column size of 1st matrix:");
        int b=sc.nextInt();

        System.out.print("Enter row size of 2nd matrix:");
        int x=sc.nextInt();
        System.out.print("Enter column size of 2nd matrix:");
        int y=sc.nextInt();

        int arr1[][]=new int[a][b];
        int arr2[][]=new int[x][y];

        if(b!=x)
        {
            System.out.println("MULTIPLICAION NOT POSSIBLE");
            System.exit(0);
        }

        int mul[][]=new int[a][y]; 

        System.out.println("Enter the elements of 1st matrix:");
        int i,j,k;
        for(i=0;i<a;i++)
        {
            for(j=0;j<b;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        
        System.out.println("Enter the elements of 2nd matrix:");
        for(i=0;i<x;i++)
        {
            for(j=0;j<y;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }

        for(i=0;i<a;j++)
        {
            for(j=0;j<y;j++)
            {
                mul[i][j]=0;
                for(k=0;k<b;k++)
                {
                    mul[i][j]=mul[i][j]+(arr1[i][k]*arr2[k][j]);
                }
            }
        }

        System.out.println("MULTIPLICATION :-");
        for(i=0;i<a;i++)
        {
            for(j=0;j<y;j++)
            {
                System.out.print(mul[i][j]);
            }
            System.out.println();
        }
    }
}