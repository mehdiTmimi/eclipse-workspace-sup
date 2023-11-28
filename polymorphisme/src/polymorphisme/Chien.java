package polymorphisme;

public class Chien extends Animal{

	public void crier() {
		System.out.println("howhow");
	}
	public abstract void teste();
	public String toString() {
		return "c'est un chien";
	}
}
