package Recursive_Functions;
class RecMultiply
{
    int Multiply(int p,int q)
    {
        if(q==0)
        {
            return 0;
        }
        else
        {
            return p+Multiply(p,--q);
        }
    }
}