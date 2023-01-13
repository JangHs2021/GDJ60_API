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

import com.iu.api4.network.ex.clients.StudentDTO;

public class ServerMain {

	public static void main(String[] args) {
		ServerSocket ss = null;
		Socket socket = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		BufferedReader br2 = null;
		
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		FileReader fr = null;
		
		boolean check = true;
		
		try {
			ss = new ServerSocket(8888);
			socket = ss.accept();
			
			is = socket.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			os = socket.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
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
			fr = new FileReader(file);
			br2 = new BufferedReader(fr);
			
			ArrayList<String> ar = new ArrayList<>();
			ar.add(br2.readLine());
			ar.add(br2.readLine());
			ar.add(br2.readLine());
			
			while(check) {
				String data = br.readLine();
				int select = Integer.parseInt(data);
				
				switch(select) {
				case 1:
					for(int i = 0; i < ar.size(); i++) {
						bw.write(ar + "\r\n");
						bw.flush();
					}
					break;
				}
			}
			
		} catch (Exception e) {
	
			e.printStackTrace();
		}	
	}
}
