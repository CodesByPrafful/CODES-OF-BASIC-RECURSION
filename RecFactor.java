package Recursive_Functions;
class RecFactor
{
    void factor(int n, int i)
    {
        if(i<=n)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
            factor(n,++i);
        }
    }
}