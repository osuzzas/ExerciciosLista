import java.util.Scanner;
public class SalarioMinimo {
	public static void main (String args[]){
		double s; 
		Scanner in=new Scanner (System.in);
		System.out.println("Digite seu salário:");
		s=in.nextDouble();
		if (s<1212) {
			System.out.println("Salário abaixo do Salário minímo");
		}else {
			System.out.println("Salário acima do Salário minímo");
			in.close();
		}
	}
}
