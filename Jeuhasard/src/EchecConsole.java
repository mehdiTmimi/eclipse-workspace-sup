
public class EchecConsole implements IEchec{

	private int nbrEchec;
	public EchecConsole() {
		this.nbrEchec=0;
	}
	@Override
	public void loose(int nbrLucky) {
		System.err.println("sorry , u lost. "+
				"the lucky number was " +nbrLucky);
		this.nbrEchec++;
	}
	public int getNbrEchec() {
		return this.nbrEchec;
	}
}
