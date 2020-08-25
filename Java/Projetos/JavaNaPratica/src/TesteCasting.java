
public class TesteCasting {

	public static void main(String[] args) {
		int x = 10; //declara��o normal de uma vari�vel do tipo int
		double y = x; //valor de x converido para double, casting impl�cito
		long z = 10L; //por padr�o o 10 � um int, depois convertido para long
		
		float w = 10.0F; //por padr�o 10.0 � um double, depois convertido para float
		int r = (int)14.5; //casting expl�cito, converte double para int truncando
						   //o valor decimal
		byte b = 127; //o tipo byte s� vai at� 127, mais do que isso n�o aceita
		
		System.out.println(x+", "+y+", "+z+", "+w+", "+r+", "+b);
	}

}
