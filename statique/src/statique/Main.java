package statique;

public class Main {

	public static void main(String[] args) {
		Personne p = new Personne();
		p.name="mehdi";
		p.counter=10;
		Personne p2 = new Personne();
		p2.name="ali";
		p2.counter=30;
		System.out.println(p.name);
		System.out.println(p.counter);
		System.out.println(p2.name);
		System.out.println(p2.counter);
		System.out.println(Personne.counter);
		//System.out.println(Personne.name); // error
	}
}
