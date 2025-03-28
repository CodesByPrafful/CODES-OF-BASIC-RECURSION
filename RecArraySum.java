package Recursive_Functions;
class RecArraySum
{
    int arrSum(int a[],int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return a[n-1]+arrSum(a,n-1);
        }
    }
}