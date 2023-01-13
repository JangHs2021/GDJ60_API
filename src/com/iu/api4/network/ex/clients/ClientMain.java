package com.iu.api4.network.ex.clients;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientMain {

	public static void main(String[] args) {
		StudentController studentController = new StudentController();
		
		Socket socket = null;
		
		try {
			socket = new Socket("192.168.1.126", 8181);
			
			studentController.start();
			
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		
	}
}
