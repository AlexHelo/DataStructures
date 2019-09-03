public class Hanoi{
	public static void hanoiRecursivo(int n, int torre1, int torre2, int torre3){
		if (n==1){
			System.out.println("Mueve disco "+n+" desde la torre "+torre1+" hasta torre "+torre3);
		}
		else{
			hanoiRecursivo(n-1,torre1,torre3,torre2);
			System.out.println("Mueve disco "+n+" desde la torre "+torre1+" hasta torre "+torre3);
			hanoiRecursivo(n-1,torre2,torre1,torre3);
		}
	}
}