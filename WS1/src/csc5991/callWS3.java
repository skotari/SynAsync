package csc5991;

import java.rmi.RemoteException;

import csc5991.WS3Stub;
import csc5991.WS3Stub.OP31;
import csc5991.WS3Stub.OP31Response;
public class callWS3 {
	public String callWS3() {
		
		try
		{
		WS3Stub stub = new WS3Stub();	
		OP31 op=new OP31();
		OP31Response res = stub.oP31(op);
		return res.get_return();
		}
		catch(RemoteException e)
		{
			return e.getMessage();
		}
		}

}
