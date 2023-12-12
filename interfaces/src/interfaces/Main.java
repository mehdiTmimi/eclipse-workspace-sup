package interfaces;

public class Main {

	public Main() {
		I i = new C();
		I i2 = i;
		i2.crier();
	}
	public static void main(String[] args) {
		new Main();
	}
}


