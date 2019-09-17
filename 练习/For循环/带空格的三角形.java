public class Temp {
	public static void main(String[] args) {
		int n = 3;
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < 2*n; j++) {
				if(j > n+1){
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