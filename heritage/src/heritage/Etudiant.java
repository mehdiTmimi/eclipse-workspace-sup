package heritage;

public class Etudiant extends Personne{

	private String cne;
	public void teste() {
		this.protectedNbr=10;
		this.publicNbr=20;
		//this.privateNbr=10; // error
	}
	public String getCne() {
		return cne;
	}
	public void setCne(String cne) {
		this.cne = cne;
	}
	
}
