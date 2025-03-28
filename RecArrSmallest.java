package Recursive_Functions;
class RecArrSmallest
{
    int smallest(int a[],int n)
    {
        if(n==1)
        {
            return a[0];
        }
        else
        {
            return Math.min(a[n-1],smallest(a,n-1));
        }
    }
}