package com.iu.api4.network.ex.servers;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		File file = new File("C:\\fileTest");
		String [] names = file.list();
		long max = 0;
		
		for(String name : names) {
			name = name.substring(0, name.lastIndexOf("."));
			long date = Long.parseLong(name);
			if(date > max) {
				max = date;
			}
		}
		
		file = new File("C:\\fileTest", max + ".txt");
		FileReader fr = null;
		
		try {
			ss = new ServerSocket(8989);
			socket = ss.accept();
			
			boolean check = true;
			String nameNum = null;
			
			while(check) {
				String data = br.readLine();
				int num = Integer.parseInt(data);
				
				switch(num) {
				case 1 :
					fr = new FileReader(file);
					br = new BufferedReader(fr);
					bw.write(br.readLine());
					break;
				case 2 :
					br.readLine();
					
					
					break;
				case 3 :
					
					break;
				case 4 :
					
					break;
				default :
					check = false;
				}
				
				
				
			}
			
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}	
	}
}
