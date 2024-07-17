package BasicArrayProgramming;

public class Arr3 {
public static void main(String[] args) {
	int r=4;
	int c=4;
	int[][]array=new int[r][c];
	int v=1;
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			array[i][j]=v;
			v++;
		}
	}
	System.out.println("Two dimensional array is :");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(array[i]  [j]+" ");
		}
		System.out.println(  );
	}
}
}
