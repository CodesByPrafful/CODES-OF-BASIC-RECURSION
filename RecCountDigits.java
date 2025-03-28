package Recursive_Functions;
import java.util.*;
class RecCountDigits
{
    int count(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return 1+count(n/10);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int n=sc.nextInt();
    }
}