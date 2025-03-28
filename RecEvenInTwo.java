package Recursive_Functions;
class RecEvenInTwo
{
    void even(int a,int b)
    {
        if(a>b)//base case
        {
            return;
        }
        else
        {
            if(a%2==0)
            {
                System.out.println(a);
            }
            even(++a,b);//recursive case
        }
    }
}