import java.util.Scanner;

public class Flower{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.print("please inter number : ");
	int n = scan.nextInt();
	for(int i = 0; i < (2*n+1); i++){
	    if(i <= n)
		{
		    for(int j = 0;j <= (2*n+1) ; j++){
			if(j > (n-i) && j <= (n+i+1)){
			    System.out.print("*");
			}
			else if(j >= (2*n+1)){
			    System.out.println();
			}
			else{
			    System.out.print(" ");
			}
		    }
		}
	    else{
		System.out.println();
		for(int j = 0 ; j <= (2*n+1) ;j++){
		    if(j > (i-n) && j <= (3*n-i+1)){
			System.out.print("*");
		    }
		    else if(j > (2*n+1)){
			System.out.println();
		    }
		    else{
			System.out.print(" ");
		    }
		 }
	    }
	}
	System.out.println();
    }
}
