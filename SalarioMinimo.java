import java.util.Scanner;
public class SalarioMinimo {
	public static void main (String args[]){
		double s; 
		Scanner in=new Scanner (System.in);
		System.out.println("Digite seu sal�rio:");
		s=in.nextDouble();
		if (s<1212) {
			System.out.println("Sal�rio abaixo do Sal�rio min�mo");
		}else {
			System.out.println("Sal�rio acima do Sal�rio min�mo");
			in.close();
		}
	}
}
