import java.util.Scanner;

public class Temp {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("请输入行数：");
		int n = scan.nextInt();
//		int n = 15;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j <= 2*n; j++) {
				if(j > 2*n-1){
					System.out.println();
				}else if(j < n-i-1 || j >= n+i+1){
					System.out.print(" ");
				} else {
					if(i%2 == 0) {
						if(j%2 == 0) { 
								System.out.print("*");
						}else {
							System.out.print(" ");
						}
					}else {
						if(j%2 == 0) {
								System.out.print(" ");
						}else {
							System.out.print("*");
						}
					}
				}
			}
		}
	}
}
