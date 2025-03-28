package Recursive_Functions;
class RecTable 
{
    void Table(int n,int t)
    {
        if(t<=10)
        {
            System.out.println(n*t);//statement written before the recursive call ( Tail Recursion )
            Table(n,++t);
        }
    }
}