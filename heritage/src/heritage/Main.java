package heritage;

public class Main {

	public Main() {
		Personne p1 = new Etudiant();
		afficher(p1);
		Personne p2 = new Professeur();
		afficher(p2);
	}
	public void afficher(Personne p) {
		Etudiant e = (Etudiant) p;
		e.teste();
	}
	public static void main(String[] args) {
		new Main();
	}

}
