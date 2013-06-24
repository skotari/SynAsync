package edu.cs.csc5991;

import java.rmi.RemoteException;

import csc5991.WS1CallbackHandler;
import csc5991.WS1Stub;


public class callWS1Asyn {
	static String res;
	public String  callWS1() {
		
		
		try
		{
		WS1Stub stub = new WS1Stub();
		WS1Stub.Op11 op=new WS1Stub.Op11();
		 WS1CallbackHandler callBackHandler = new WS1CallbackHandler() {
			 public void receiveResultop11(WS1Stub.Op11Response param)
			 {
				
				res = param.get_return();
				System.out.println("here"+res);
			 }
			 public void receiveErrorop11(Exception e)
			 {
				 System.out.println(e);
			 }
			 
			 
		};
		 stub.startop11(op, callBackHandler);
		 Thread.sleep(10000);
		}
		catch(RemoteException | InterruptedException e)
		{
			System.out.println(e.getMessage());
		}
		return res;
	}	
	public static void main(String[] args) {
			callWS1Asyn asc= new callWS1Asyn();
		System.out.println(asc.callWS1());
	}


}
