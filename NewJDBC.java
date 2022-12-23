import java.sql.*;
import java.util.Scanner;

class NewJDBC
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
                System.out.println("1.Add Data---2.Display data---3.Exit");
                ch=sc.nextInt();


                if(ch==1)
                {
                    System.out.println("Input Employee ID, Name ,Designation :");
                    int id=sc.nextInt();
                    String nam =sc.next();
                    String design =sc.next();
                    String sql = "insert into employee " + " (empid, ename, desig)" + " values (?, ?, ?)";
                    PreparedStatement pstmt = con.prepareStatement(sql);
// set param values
                    pstmt.setInt(1,id);
                    pstmt.setString(2,nam);
                    pstmt.setString(3,design);
// 3. Execute SQL query1
                    pstmt.executeUpdate();
                }


                if(ch==2)
                {
                    Statement stmt=con.createStatement();
                    ResultSet rs=stmt.executeQuery("select * from employee");
                    while(rs.next())
                        System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
                }
            }
            sc.close();
            con.close();
        }
        catch(Exception e)
        { System.out.println(e);}
    }
}