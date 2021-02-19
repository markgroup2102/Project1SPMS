package com.revature.files;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.util.Scanner;

public class Deserializing {

	public static void main(String[] args) {
		
		
		try {
		
			InputStream input = Deserializing.class.getResourceAsStream("/com/revature/resources/example.dat");
		
			ObjectInputStream ois = new ObjectInputStream(input);
			SerializableClassExample object;
			while( (object = (SerializableClassExample)ois.readObject()) != null) {
	
				System.out.println(object.getData());
			}
		}catch (EOFException e) {
		}catch (Exception e) {
			System.out.println("Not working");
			e.printStackTrace();
		}
	}
}

/*
Deserializing an object
To deserialize an Object, you need a FileInputStream instance inside the constructor of an ObjectInputStream, passing in the file path of where the serialized object is

Call the ObjectInputStream.readObject() method, casting it to a bean of your type
*/