
public class Lion extends Animal{

	public Lion() {
	}
	
	public Lion(float poids, String cri) {
		super(poids, cri);
	}

	@Override
	public void run() {
		System.out.println("Lion => run");
	}
	@Override
	public void crier() {
		System.out.println("Lion => "+this.cri);
	}
	

	

}
