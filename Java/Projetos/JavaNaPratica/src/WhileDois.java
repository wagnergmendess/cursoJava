
public class WhileDois {

	public static void main(String[] args) {
		int num = 0;
		
		while (num <= 70) {
			if (num%4 == 0) {
				System.out.println(num+" � divis�vel por 4");
			}else if (num % 2 != 0) {
				System.out.println(num+" � �mpar");
			}
			num++;
		}
	}

}
