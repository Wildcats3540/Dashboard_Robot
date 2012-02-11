package com.wildcatrobotics.Dashboard_Robot;

import java.io.DataOutputStream;

import javax.microedition.io.Connector;
import javax.microedition.io.ServerSocketConnection;
import javax.microedition.io.SocketConnection;

/*
 * Data server. This runs on a separate thread so it dosen't lag your main code.
 * 
 * 
 * 
 */
public class DataServer extends Thread{

	Main m;
	public DataServer(Main m){
		this.m = m;
	}


	ServerSocketConnection scn;
	SocketConnection sc;
	//
	//Specify the port you want the server to be run on
	//
	int port = 7777;

	public void run(){
		try{
			while(true){
				scn = (ServerSocketConnection) Connector.open("socket://:"+port);
				sc = (SocketConnection) scn.acceptAndOpen();
				Main.disp(1, "Conection Opened          ");
				DataOutputStream os = sc.openDataOutputStream();
				try {
					while (true) {
						os.writeUTF(m.update().toString());
					}
				} catch (Exception e) {
				}
				Main.disp(1,"Connection Closed");
				scn.close();
				sc.close();
				os.close();

			}
		}catch(Exception e){}
	}
}