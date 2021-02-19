package com.revature.files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class SerializableClassExample implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String s = " I am some data";
	public SerializableClassExample() {
		
	}
	
	public String getData(){
		return s;
	}
	
	public static void main(String[] args) {
		SerializableClassExample example = new SerializableClassExample();
		
		 OutputStream fos;
		 ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("C:\\Users\\mwhis\\eclipse-workspace\\Java Basics\\src\\com\\revature\\basics\\example.dat");
			oos = new ObjectOutputStream(fos);
			oos.writeObject(example);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
/*
Serializing an object
To serialize an Object, you need a FileOutputStream instance inside the constructor of an ObjectOutputStream, passing in the file path of where you want the Object to be serialized

Call the ObjectOutputStream.writeObject(yourObject) method*/