import java.util.Scanner;
public class Maopao{
	public static void main(String [] args){
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入需要比较几个数：");
		int size = scan.nextInt();
		int[] a= new int[size];
		for(int j=0;j<size;j++)
		{
			System.out.print("共"+size+"个数,请输入第"+(j+1)+"个数：");
			a[j] = scan.nextInt();
		}
		for(int i=0;i < (a.length-1) ; i++)
		{
			for(int j = 0; j < (a.length-1) ; j++ )
			{
				if(a[j] > a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int x=0; x<a.length; x++)
		{
			System.out.print(a[x]+ " ");
		}
		System.out.print("\n");
			
	}
}
