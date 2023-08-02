//Time complexity :O(n^2)
//Space complexity:O(1)
import java.util.Scanner;
import java.io.*;

class bubble
{
public static void main(String args[])
{

int a[]={4,2,3,6,1,5};

/*USING BUBBLE SORT*/

for(int i=0;i<=a.length-1;i++)
{

	for(int j=0;j<=a.length-2;j++)
	{
		if(a[j]>a[j+1])
		{
			int temp;
			temp=a[j];
			a[j]=a[j+1];
			a[j+1]=temp;
		}
		else
		{
			continue;
		}

	}

}

for(int k=0;k<=a.length-1;k++){

System.out.println(a[k]);}

}
}
			
		
