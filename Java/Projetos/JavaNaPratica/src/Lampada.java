
public class Lampada {
	boolean ligada;
	
	void ligar() {
		this.ligada = true;
	}
	
	void desligar() {
		this.ligada = false;
	}
	
	void imprimir() {
		if(this.ligada == true) {
			System.out.println("L�mpada ligada");
		}else {
			System.out.println("L�mpada desligada");
		}
	}
}
