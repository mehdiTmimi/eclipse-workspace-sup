package heritage;

public class Personne {

	private int privateNbr;
	protected int protectedNbr;
	public int publicNbr;
	//int packageNbr;
	public int getPrivateNbr() {
		return privateNbr;
	}
	public void setPrivateNbr(int privateNbr) {
		this.privateNbr = privateNbr;
	}
	public int getProtectedNbr() {
		return protectedNbr;
	}
	public void setProtectedNbr(int protectedNbr) {
		this.protectedNbr = protectedNbr;
	}
	
}
