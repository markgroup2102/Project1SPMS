package Exceptions;

public class Runner {
	public void run() throws CustomException{
		throw new CustomException("ALERT");
	}
}
