package com.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.concurrent.atomic.AtomicInteger;

public class Ser {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("counter.ser"));
		AtomicInteger atomicInteger=new AtomicInteger(1);
		oos.writeObject(atomicInteger);
	}

}
