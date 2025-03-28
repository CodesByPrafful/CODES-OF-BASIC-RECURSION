package Recursive_Functions;
import java.util.*;
class RecSumNatural
{
    int sum(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else
        {
            return n+sum(n-1);
        }
    }
}