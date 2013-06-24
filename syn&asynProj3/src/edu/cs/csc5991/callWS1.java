package edu.cs.csc5991;

import java.rmi.RemoteException;

import csc5991.WS1Stub;
import csc5991.WS1Stub.Op11;
import csc5991.WS1Stub.Op11Response;

public class callWS1 {
	
		public String  callWS1Syn() {
			try
			{
			WS1Stub stub = new WS1Stub();
			Op11 op=new Op11();
			Op11Response res=stub.op11(op);
			return res.get_return();
			}
			catch(RemoteException e)
			{
				return e.getMessage();
			}
		}

		public static void main(String[] args) {
			callWS1 ws= new  callWS1();
			System.out.println(ws.callWS1Syn());
		}

}
