package week3.day1assignment;

public class APIClient {
	public void sendRequest(String Endpoint) {
		System.out.println("The end point version is "+Endpoint);
	}
	public void sendRequest(String Endpoint,String requestBody,boolean requestStatus) {
		System.out.println("The end point version is " +Endpoint+", the request body is in "+requestBody+" and the request status is "+requestStatus);
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient a=new APIClient();
		a.sendRequest("apache 4.0.0");
		a.sendRequest("Apache 6.0.0", "Loadedstatus",true);
	}

}
