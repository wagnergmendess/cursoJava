
public class TesteString {
	public static void main(String[] args) {
		//utilizando o modo literal que � o mais usado
		String nome = "Antonio";
		String sobrenome = "Marcos";
		
		System.out.println("Concatenando: "+nome+sobrenome);
		System.out.println("Tudo mai�scula: "+nome.toUpperCase());
		System.out.println("Tudo min�scula: "+sobrenome.toLowerCase());
		System.out.println("Retorna o caractere da posi��o: "+nome.charAt(4));
		System.out.println("Retorna a quantidade de caracteres: "+sobrenome.length());
		System.out.println("Recebe um int e retorna a partir da posi��o: "+sobrenome.substring(3));
		System.out.println("Recebe um char e retorna a posi��o da primeira ocorr�ncia: "+nome.indexOf('t'));
		System.out.println("Verifica se termina com o valor especificado: "+nome.endsWith("nio"));
		System.out.println("Verifica se come�a com o valor espec�ficado: "+nome.startsWith("cos"));

	}

}
