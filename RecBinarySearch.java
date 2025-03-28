package Recursive_Functions;
import java.util.*;
class RecBinarySearch
{
    int bsearch(int x[],int l,int h,int f,int ele)
    {
        int mid;
        mid=(l+h)/2;
        if(l>h || f==1)
        {
            return f;
        }
        else if(ele == x[mid])
        {
            f=1;
        }
        else if(ele < x[mid])
        {
            h=mid-1;
        }
        else
        {
            l=mid+1;
        }
        return bsearch(x,l,h,f,ele);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        int a[]=new int[size];
        System.out.println("Enter the elements in the array:");
        for(int i=0;i<size;i++)
        {
            a[i]=sc.nextInt();
        }
        int lb=0;
        int ub=size-1;
        int f=0;
        RecBinarySearch obj=new RecBinarySearch();
        System.out.println("Enter the element to search");
        int element=sc.nextInt();
        f=obj.bsearch(a,lb,ub,f,element);
        if(f==1)
        {
            System.out.println("Element Found");
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}