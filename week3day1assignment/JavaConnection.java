package week3.day1assignment;

public class JavaConnection extends MySqlConnection implements DatabaseConnection {
	
		
	
  public static void main(String[] args) {
	  JavaConnection j=new JavaConnection();
	 j.connect();
	 j.disconnect();
	 j.executeUpdate();
	 j.executeQuery();
}

public void connect() {
	// TODO Auto-generated method stub
	System.out.println("connected-> javaconnection");
}

public void disconnect() {
	// TODO Auto-generated method stub
	System.out.println("disconnected->java connection");
}
public void executeUpdate() {
	// TODO Auto-generated method stub
	System.out.println("Updates completed->java connection class");
	

}
	
}

