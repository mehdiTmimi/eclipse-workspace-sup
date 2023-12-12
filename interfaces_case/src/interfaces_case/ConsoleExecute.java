package interfaces_case;

public class ConsoleExecute implements I{

	@Override
	public void execute(int res) {
		System.out.println("console : " + res);
	}

}
