package Collections;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		ArrayList<Account> list = (ArrayList<Account>) Account.createAccounts(5);
		for(Account a : list) {
			System.out.println( a.getId());
		}
	}

}
