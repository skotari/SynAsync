package csc5991;

public class WS1 {

	public String op11()
	{
		long startTime=System.nanoTime();
		callWS2 ws2=new callWS2();
		callWS3 ws3=new callWS3();
		String res1=ws2.callWS2();
		String res2=ws3.callWS3();
		long endTime=System.nanoTime();
		return String.valueOf((endTime-startTime)/1000000000);
	}
}
