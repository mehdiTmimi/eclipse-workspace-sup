public abstract class Person {

	protected String nom;
	protected String prenom;
	public Person() {
		super();
		this.nom="";
		this.prenom="";
	}
	public Person(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}
	public abstract void sePresenter();
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	
}
