
public class Homme extends Person{
	private int testesteronelevel;
	public Homme() {
		super();
		this.testesteronelevel=1;
	}
	public Homme(String nom,String prenom,int testesteronelevel) {
		super(nom,prenom);
		this.testesteronelevel=testesteronelevel;
	}
	@Override
	public void sePresenter() {
		System.out.println("je suis " +
	this.nom + " " + this.prenom + " et je suis un homme");
		
		
	}

}
