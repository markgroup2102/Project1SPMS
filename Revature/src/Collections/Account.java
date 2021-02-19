package Collections;

import java.util.ArrayList;
import java.util.List;

public class Account {

	
	private static long totalAccounts;
	private long id;
	private String accountType;
	
	public Account(String accountType) {
		this.id = ++totalAccounts;
		
		accountType =  (accountType == null ? "custom" : accountType);
		this.accountType = accountType;
	}

	public long getId() {
		return id;
	}

	public String getAccountType() {
		return accountType;
	}
	
	public static List<Account> createAccounts(int number){
		ArrayList<Account> list = new ArrayList<Account>();
		if(number > 0) {
			
			for(int x = 0; x < number; x++) {
				list.add(new Account(null));
			}
		}
		return list;
	}
}
