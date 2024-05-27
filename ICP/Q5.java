import java.util.*;
import java.io.*;

class Q5
{

static void RightRotate(int a[],
						int n, int k)
{

	k=k%n;

	for(int i = 0; i < n; i++)
	{
		if(i<k)
		{

			System.out.print(a[n + i - k]
							+ " ");
		}
		else
		{

			System.out.print(a[i - k]
							+ " ");
		}
	}
	System.out.println();
}

public static void main(String args[])
{
	int Array[] = {10,20,30,40,50,60};
	int N = Array.length;

	int K = 4;
	RightRotate(Array, N, K);

}
}
//Time complexity : O(n) 
//Auxiliary Space : O(1)
