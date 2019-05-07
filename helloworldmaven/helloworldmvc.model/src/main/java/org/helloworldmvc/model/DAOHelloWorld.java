package org.helloworldmvc.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.helloworldmvc.Contract.IModel;

public class DAOHelloWorld implements IModel {

	
	
	private File FileName = new File("C:\\Users\\travail\\Desktop\\Projet\\Github\\helloworldmvc\\helloworldmaven\\helloworldmvc.model");
	private DAOHelloWorld instance = null;
	private String helloWorldMessage = null;
	
	DAOHelloWorld () {
		
		
	}
	

	public DAOHelloWorld getInstance() {
		return instance;
	}


	public void setInstance(DAOHelloWorld instance) {
		this.instance = instance;
	}





	public void setHelloWorldMessage(String helloWorldMessage) {
		this.helloWorldMessage = helloWorldMessage;
	}


	private String readFile ()  throws FileNotFoundException {
	Scanner fileScnr = new Scanner(FileName);
	helloWorldMessage = fileScnr.nextLine();
	return helloWorldMessage;
	
}

	
	public String getHelloWorldMessage() throws FileNotFoundException {
		
		return readFile();
	}


	public String getHelloWorld() {
		// TODO Auto-generated method stub
		return null;
	}
}
