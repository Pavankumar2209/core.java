package com.xworkz.exceptionapp.task1;

import java.io.File;

import java.io.IOException;

public class CreateNewFile {
		
		
		File files[];
	
			public CreateNewFile(int size) {
					files = new File[size];
		
			}
	
	
			public void creatFile(String filename) {
		
				File file = new File(filename);
				try {
					file.createNewFile();   //whenever we use creatwNewFile method we get IoException
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
}
