package p2;


public class Main {

	private Personne p2;
	public Main() {
		Personne p = new Personne("mehdi");
		p2 = new Personne("ali");
		System.out.println(p.getName());
		System.out.println(p.getCounter());
		System.out.println(p2.getName());
		System.out.println(p2.getCounter());
		System.out.println(Personne.getCounter());
		//System.out.println(Personne.name); // error
		ex1();
	}
	public static void main(String[] args) {
		new Main();
	}
	public void ex1() {
		System.out.println(p2.getName());
	}
}
