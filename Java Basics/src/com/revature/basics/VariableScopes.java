package com.revature.basics;

public class VariableScopes {
	public static String staticVariable = "I Belong to the class and live during the application";
	public String variable = "I need an object to live";
	
	static {
		// This area sets static variables
		staticVariable +=  " \n     This part was added in the static block!";
	}
	
	{
		// This is an instance block it sets variables before the constructor is called
		variable += "\n     This was added in the instance block!";
	}
	
	public VariableScopes() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("staticVariable says:" + staticVariable);
		
		VariableScopes vsc = new VariableScopes();
		System.out.println("variable says : " + vsc.variable);
		
		String local = " I can only be used locally";
		if(true) {
			System.out.println("local says : " + local);
		}
		
		System.out.println("method variable says : " + vsc.methodVariable());

	}
	
	private String methodVariable() {
		String methodVariable = " I live in a method";
		return methodVariable;
	}

}
