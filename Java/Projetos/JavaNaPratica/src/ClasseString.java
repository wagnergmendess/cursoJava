public class ClasseString {
	public static void main(String[] args) {
		String y1 = "abc";
		String y2 = "abc";
		
		if (y1 == y2) {
			System.out.println("Vari�veis y1 e y2 conte�dos iguais");
		}else {
			System.out.println("Vari�veis y1 e y2 conte�dos diferentes");
		}
		
		String x1 = new String("abc");
		String x2 = new String("abc");
		
		if (x1 == x2) {
			System.out.println("Vari�veis x1 e x2 s�o iguais");
		}else {
			System.out.println("Vari�veis x1 e x2 s�o diferentes");
		}
		
		if (x1.equals(x2)) {
			System.out.println("Objetos x s�o iguais.");
		}else {
			System.out.println("Objetos x s�o diferentes");
		}

	}

}
