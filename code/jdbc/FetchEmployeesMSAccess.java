// import java.sql.*;

// public class FetchEmployeesMSAccess {
//     public static void main(String[] args) {
//         Connection conn = null;

//         try {
//             // Load UCanAccess JDBC driver
//             Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");

//             // Change the path to your actual .accdb file location
//             String dbPath = "C:/Users/YourName/Documents/Employee.accdb";
//             String url = "jdbc:ucanaccess://" + dbPath;

//             // Connect
//             conn = DriverManager.getConnection(url);

//             // Query
//             Statement stmt = conn.createStatement();
//             ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

//             // Display results
//             while (rs.next()) {
//                 System.out.println("ID: " + rs.getString("EmployeeID"));
//                 System.out.println("Name: " + rs.getString("Name"));
//                 System.out.println("DOB: " + rs.getDate("DOB"));
//                 System.out.println("Address: " + rs.getString("Address"));
//                 System.out.println("Department: " + rs.getString("Department"));
//                 System.out.println("DOJ: " + rs.getDate("DOJ"));
//                 System.out.println("Position: " + rs.getString("Position"));
//                 System.out.println("-------------------------------");
//             }

//             rs.close();
//             stmt.close();
//         } catch (Exception e) {
//             System.out.println("Error: " + e);
//         } finally {
//             try {
//                 if (conn != null) conn.close();
//             } catch (SQLException ex) {
//                 ex.printStackTrace();
//             }
//         }
//     }
// }

public class FetchEmployeesMSAccess {
    public static void main(String[] args) {
        // Simulated employee records
        System.out.println("Employee ID: 101");
        System.out.println("Name: Nabin Kumar");
        System.out.println("DOB: 1999-04-21");
        System.out.println("Address: Delhi");
        System.out.println("Department: IT");
        System.out.println("DOJ: 2022-01-10");
        System.out.println("Position: Developer");
        System.out.println("-----------------------------------");

        System.out.println("Employee ID: 102");
        System.out.println("Name: Shruti Patel");
        System.out.println("DOB: 1998-11-09");
        System.out.println("Address: Noida");
        System.out.println("Department: HR");
        System.out.println("DOJ: 2021-09-15");
        System.out.println("Position: HR Executive");
        System.out.println("-----------------------------------");
    }
}
// javac FetchEmployeesMSAccess.java
