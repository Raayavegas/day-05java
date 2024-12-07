import java.util.*;
class A 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==1)
        {
            System.out.println("weird");
        }
        if(n>=2 && n<=5)
        {
            if(n%2==0)
            {
                System.out.println("not weird");
            }
        }
        else{
            if(n>=6 && n<=20)
            {
                System.out.println("not weird");
            }
        }
            if(n>20)
            {
                if(n%2==0)
                {
                System.out.println("not weird");
                }
            }
    }
}