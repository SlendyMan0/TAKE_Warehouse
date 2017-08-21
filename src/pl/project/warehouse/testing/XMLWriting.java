package pl.project.warehouse.testing;

public class XMLWriting {
	public static void main(String[] args) {
		//client
		
		String serverUrl= "http://localhost:8080/warehouse/client";
		String url= serverUrl+"/create";
		String message = "<xClient idc=\"0\"><name>Jan</name><surname>Kowalski</surname><companyName>WhiteLightningHQ</companyName></xClient>";
		String txt = HttpHelper.doPost(url,message,"application/xml");
		System.out.println(txt);
		
		serverUrl= "http://localhost:8080/warehouse/client";
		url= serverUrl+"/create";
		message = "<xClient idc=\"0\"><name>Janusz</name><surname>Janusz</surname><companyName>WhiteLightningHQ</companyName></xClient>";
		txt = HttpHelper.doPost(url,message,"application/xml");
		System.out.println(txt);
		
		serverUrl= "http://localhost:8080/warehouse/client";
		url= serverUrl+"/create";
		message = "<xClient idc=\"0\"><name>Janek</name><surname>Kowalek</surname><companyName>WhiteLightningHQ</companyName></xClient>";
		txt = HttpHelper.doPost(url,message,"application/xml");
		System.out.println(txt);
		
		//depot
		
		serverUrl= "http://localhost:8080/warehouse/depot";
		url= serverUrl+"/create";
		message = "<xDepot idd=\"0\"><adress>Jasna</adress><spaceAvalible>12</spaceAvalible><spaceTaken>30</spaceTaken></xDepot>";
		txt = HttpHelper.doPost(url,message,"application/xml");
		System.out.println(txt);
		
		//order
		
		serverUrl= "http://localhost:8080/warehouse/order";
		url= serverUrl+"/create";
		message = "<xOrder ido=\"0\"><totalCost>123</totalCost></xOrder>";
		txt = HttpHelper.doPost(url,message,"application/xml");
		System.out.println(txt);
		
		//product
		
		serverUrl= "http://localhost:8080/warehouse/product";
		url= serverUrl+"/create";
		message = "<xProduct idp=\"0\"><amount>3</amount><cost>9</cost></xProduct>";
		txt = HttpHelper.doPost(url,message,"application/xml");
		System.out.println(txt);

		//lexicon
		
		serverUrl= "http://localhost:8080/warehouse/lexicon";
		url= serverUrl+"/create";
		message = "<xProductLexicon idl=\"0\"><name>Kurz</name><description>Tego zawsze du¿o.</description></xProductLexicon>";
		txt = HttpHelper.doPost(url,message,"application/xml");
		System.out.println(txt);
		
	}
}
