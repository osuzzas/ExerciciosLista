import java.util.*;
public class NumeroNeutro {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		double n;
		System.out.println("Digite um número");
		n=in.nextDouble();
		if(n==0) {
				System.out.println("O número é neutro");
		}else if(n>0) {
			System.out.println("O número é positivo");
		}else{
			System.out.println("O número é negativo");
		}
		
	}		

}
