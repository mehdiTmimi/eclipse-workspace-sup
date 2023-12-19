
public class Tigre extends Animal{

	public Tigre() {
	}
	
	public Tigre(float poids, String cri) {
		super(poids, cri);
	}
	@Override
	public void run() {
		System.out.println("Tigre => run");
	}
	@Override
	public void crier() {
		System.out.println("Tigre => "+this.cri);
	}
	
	

}
