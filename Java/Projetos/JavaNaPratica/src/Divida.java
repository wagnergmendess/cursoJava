import java.util.*;
public class Divida {
	public static void main(String[] args) {
		Scanner entra = new Scanner(System.in);
		double divida, dividaFinal;
		float juros;
		int qtdMeses;
		
		System.out.println("Valor da d�vida: ");
		divida = entra.nextDouble();
		System.out.println("N�mero de parcelas: ");
		qtdMeses = entra.nextInt();
		
		System.out.println("Juros de (%): ");
		juros = entra.nextFloat();
		juros = (float) (juros*(divida/100));
		dividaFinal = qtdMeses + juros + divida;
		System.out.println("Total a pagar com juros: " +(float)dividaFinal);

	}

}
