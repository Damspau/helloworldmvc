package org.helloworldmvc.model;
import org.helloworldmvc.Contract.IModel;

public class Model implements IModel {
	public String getHelloWorld( ) {
		DAOHelloWorld DAOHelloWorld = new DAOHelloWorld();
		return DAOHelloWorld.getHelloWorldMessage();
	}
}