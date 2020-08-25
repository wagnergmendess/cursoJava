
public class TesteString {
	public static void main(String[] args) {
		//utilizando o modo literal que é o mais usado
		String nome = "Antonio";
		String sobrenome = "Marcos";
		
		System.out.println("Concatenando: "+nome+sobrenome);
		System.out.println("Tudo maiúscula: "+nome.toUpperCase());
		System.out.println("Tudo minúscula: "+sobrenome.toLowerCase());
		System.out.println("Retorna o caractere da posição: "+nome.charAt(4));
		System.out.println("Retorna a quantidade de caracteres: "+sobrenome.length());
		System.out.println("Recebe um int e retorna a partir da posição: "+sobrenome.substring(3));
		System.out.println("Recebe um char e retorna a posição da primeira ocorrência: "+nome.indexOf('t'));
		System.out.println("Verifica se termina com o valor especificado: "+nome.endsWith("nio"));
		System.out.println("Verifica se começa com o valor específicado: "+nome.startsWith("cos"));

	}

}
