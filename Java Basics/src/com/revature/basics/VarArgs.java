package com.revature.basics;

public class VarArgs {

	public VarArgs() {
		// TODO Auto-generated constructor stub
	}
	
	public static void runExample(int... variableArguments) {
		int len = variableArguments.length;
		if( len > 0) {
			for(int i = 0; i < len; i++) {
				System.out.println(variableArguments[i] + "");
			}
		}else {
			System.out.println("No Arguments");

		}
	}

	public static void main(String[] args) {
		runExample();
		runExample(1,2,3);
	}

}
