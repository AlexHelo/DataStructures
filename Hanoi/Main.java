import java.util.*;
public class Main {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=0;
		System.out.println("Numero de discos:" );
		n=sc.nextInt();
		Hanoi.hanoiRecursivo(n,1,2,3);
	}	
}