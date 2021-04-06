import java.sql.*;
import java.util.*;
class input
{
public static void main(String args[])
{
try
{
Scanner sc=new Scanner(System.in);
System.out.println("enter student id");
int id=sc.nextInt();
System.out.println("enter student name");
String name=sc.next();
System.out.println("enter student address");
String address=sc.next();
//load the driver
System.out.println("driver loaded");
Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ashwini","ashwini");
System.out.println("connected to database");
Statement stmt=con.createStatement();
int k=stmt.executeUpdate("insert into student values('"+id+"','"+name+"','"+address+"')");
System.out.println(k+ "row created");
con.close();
}
catch(Exception e)
{
System.out.println("some problem in connection"+e);
}
}
}