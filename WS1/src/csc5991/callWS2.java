package csc5991;

import java.rmi.RemoteException;

import csc5991.WS2Stub;
import csc5991.WS2Stub.OP21;
import csc5991.WS2Stub.OP21Response;
public class callWS2 {
	public String  callWS2() {
		try
		{
		WS2Stub stub = new WS2Stub();
		OP21 op=new OP21();
		OP21Response res=stub.oP21(op);
		return res.get_return();
		}
		catch(RemoteException e)
		{
			return e.getMessage();
		}
	}

}
