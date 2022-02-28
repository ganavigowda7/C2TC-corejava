package tnsif.c2tc;
import java.sql.*;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args)throws  Exception {
		Scanner sc=new Scanner(System.in);
		String Name=sc.nextLine(); //"Ganavi gowda BS";//
		 int Uid=sc.nextInt();//804/
		
        int age=sc.nextInt();
		String url="jdbc:mysql://localhost:3306/batch9";
		String user="root";
		String password="123456";
		//String query="INSERT INTO `batch9`.`details` VALUES(?,?,?); ";
		 
		//String query=" UPDATE `batch9`.`details` SET `Uid` = '808' WHERE (`Uid` = '806');";
		String query="DELETE FROM `batch9`.`details` WHERE (`Uid` = '8003');";
		
 Class.forName("com.mysql.cj.jdbc.Driver");
 Connection con=DriverManager.getConnection(url, user, password); 

 PreparedStatement ps=con.prepareStatement(query);
 ps.setString(2,Name );
 ps.setInt(1, Uid);
 
 ps.setInt(3, age);
 int rs =ps.executeUpdate();
 System.out.println("no of rows updated is:"+rs);
 ps.close();
 con.close();

 }
	}