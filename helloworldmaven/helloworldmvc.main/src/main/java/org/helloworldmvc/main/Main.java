package org.helloworldmvc.main;
import org.helloworldmvc.controller.*;
import org.helloworldmvc.view.*;
import org.helloworldmvc.model.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Model modele = new Model();
		View vue = new View();
		Controller controleur = new Controller(vue, modele) ;
		controleur.run();
	}

}
