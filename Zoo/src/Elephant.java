
public class Elephant extends Animal{

	public Elephant() {
	// appel implicite du construceur sans params du Animal
	}
	
	public Elephant(float poids, String cri) {
		super(poids, cri);
	}

	@Override
	public void run() {
		System.out.println("Elephant => run");
	}
	@Override
	public void crier() {
		System.out.println("Elephant => "+this.cri);
	}
	

	

}
