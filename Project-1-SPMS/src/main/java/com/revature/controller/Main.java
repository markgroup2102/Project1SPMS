package com.revature.controller;

import java.sql.Connection;
import java.sql.SQLException;

import com.revature.utilities.AWSConnection;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Connection conn = AWSConnection.getRemoteConnection();
		try {
			conn.prepareStatement("SELECT * FROM people");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
