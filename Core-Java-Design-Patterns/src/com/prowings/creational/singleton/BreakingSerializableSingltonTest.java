package com.prowings.creational.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class BreakingSerializableSingltonTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		SerializableSingleton obj = SerializableSingleton.getInstance();
		
		//serialization
		FileOutputStream fos = new FileOutputStream("MyFile.txt");
		
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(obj);
		
		oos.close();
		
		//deserialization
		
		FileInputStream fis = new FileInputStream("MyFile.txt");
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		SerializableSingleton obj1 = (SerializableSingleton) ois.readObject();
		
		ois.close();
		
		System.out.println(obj==obj1);
		
	}

}
