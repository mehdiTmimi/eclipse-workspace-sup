package interfaces_case;

public class ErrorExecute implements I {

	@Override
	public void execute(int res) {
		System.err.println(res);
	}

}
