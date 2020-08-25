
public class TesteLampadaDois {

	public static void main(String[] args) {
		LampadaDois lamp = new LampadaDois();
		
		lamp.setLigar(true);
		System.out.println(lamp.getImprimir());
		lamp.setDesligar(false);
		System.out.println(lamp.getImprimir());

	}

}
