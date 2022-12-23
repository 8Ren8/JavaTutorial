import java.sql.*;
import java.util.Scanner;

class JDBC_student
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/my_db","root","");
//here mydb is database name, root is username and password
            int ch=0;
            while(ch!=3)
            {
                System.out.println("1.Add student Data---2.Display student data---3.Exit");
                ch=sc.nextInt();


                if(ch==1)
                {
                    System.out.println("Input Student ID, Student Name ,Student Age, Student Course :");
                    int student_id=sc.nextInt();
                    String student_name =sc.next();
                    int student_age =sc.nextInt();
                    String student_course = sc.next();
                    String sql = "insert into student " + " (student_id, student_name, student_age, student_course)" + " values (?, ?, ?, ?)";
                    PreparedStatement pstmt = con.prepareStatement(sql);
// set param values
                    pstmt.setInt(1,student_id);
                    pstmt.setString(2,student_name);
                    pstmt.setInt(3,student_age);
                    pstmt.setString(4, student_course);
// 3. Execute SQL query1
                    pstmt.executeUpdate();
                }


                if(ch==2)
                {
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from student");
                    System.out.println("ID Name Age Course:");
                    while(rs.next())
                        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4));
                }
            }
            sc.close();
            con.close();
        }
        catch(Exception e)
        { System.out.println(e);}
    }
}