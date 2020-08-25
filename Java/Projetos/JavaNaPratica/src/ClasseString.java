public class ClasseString {
	public static void main(String[] args) {
		String y1 = "abc";
		String y2 = "abc";
		
		if (y1 == y2) {
			System.out.println("Variáveis y1 e y2 conteúdos iguais");
		}else {
			System.out.println("Variáveis y1 e y2 conteúdos diferentes");
		}
		
		String x1 = new String("abc");
		String x2 = new String("abc");
		
		if (x1 == x2) {
			System.out.println("Variáveis x1 e x2 são iguais");
		}else {
			System.out.println("Variáveis x1 e x2 são diferentes");
		}
		
		if (x1.equals(x2)) {
			System.out.println("Objetos x são iguais.");
		}else {
			System.out.println("Objetos x são diferentes");
		}

	}

}
