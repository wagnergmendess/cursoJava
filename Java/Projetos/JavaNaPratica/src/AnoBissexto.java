import java.util.*;

public class AnoBissexto {
	public static void main(String[] args) {
		Scanner infor = new Scanner(System.in);
		int ano;
		System.out.print("Informe o ano: ");
		ano = infor.nextInt();
		
		if (ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0) {
			System.out.println(ano + " � bissexto");
		}else {
			System.out.println(ano + " n�o � bissexto");
		}

	}

}
