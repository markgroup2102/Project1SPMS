package com.revature.controller;

import java.math.BigDecimal;

import org.hibernate.Session;

import com.revature.models.Person;
import com.revature.utilities.HibernateUtil;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println(0.1+0.2== 0.30000000000000004);
		
		BigDecimal bd = new BigDecimal(0.1);
		BigDecimal bd2 = new BigDecimal(0.2);
		System.out.println(bd.add(bd2).equals(0.3000000000000000166533453693773481063544750213623046875));
		
	}

}
