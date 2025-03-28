package Recursive_Functions;
class RecRevTable
{
    void table(int n,int t)
    {
        if(t<10)
        {
            table(n,++t);
            System.out.println(n*t);
        }
    }
}