import java.util.*;
public class NumeroNeutro {
	public static void main(String[]args) {
		Scanner in=new Scanner(System.in);
		double n;
		System.out.println("Digite um n�mero");
		n=in.nextDouble();
		if(n==0) {
				System.out.println("O n�mero � neutro");
		}else if(n>0) {
			System.out.println("O n�mero � positivo");
		}else{
			System.out.println("O n�mero � negativo");
		}
		
	}		

}
