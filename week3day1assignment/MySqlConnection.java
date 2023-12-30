package week3.day1assignment;

public  abstract class MySqlConnection implements DatabaseConnection {
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Updates completed->abstract class");
		

}
	public void executeQuery() {
		System.out.println("query executed-> abstract class");
	}
	
	public static void main(String[] args) {
		
		
	}
}
