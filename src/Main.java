import java.sql.*;
import java.util.Scanner;
import com.learning.*;


// Database Connection Class
/** class DBConnection {

    public static Connection getConnection() throws SQLException
    {

        String url = "jdbc:mysql://localhost:3306/Employee";
        String user = "root";
        String pass = "Zimal@1234";

        return DriverManager.getConnection(url, user, pass);
    }
}**/

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // -------- NAME VALIDATION --------
        String name;
        while (true) {
            System.out.print("Enter Name (letters only): ");
            name = sc.nextLine();

            if (name.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid name format!");
            }
        }

        // -------- DEPARTMENT VALIDATION --------
        String department;
        while (true) {
            System.out.print("Enter Department (letters only): ");
            department = sc.nextLine();

            if (department.matches("[a-zA-Z ]+")) {
                break;
            } else {
                System.out.println("Invalid department format!");
            }
        }

        // -------- SALARY VALIDATION --------
        double salary;
        while (true) {
            System.out.print("Enter Salary (numbers only): ");
            String salInput = sc.nextLine();

            if (salInput.matches("\\d+(\\.\\d+)?")) {
                salary = Double.parseDouble(salInput);
                break;
            } else {
                System.out.println("Invalid salary format!");
            }
        }

        // -------- DATE VALIDATION --------
        String dob;
        while (true) {
            System.out.print("Enter Date of Birth (dd-MM-yyyy): ");
            dob = sc.nextLine();

            if (dob.matches("\\d{2}-\\d{2}-\\d{4}")) {
                break;
            } else {
                System.out.println("Invalid date format! Use dd-MM-yyyy");
            }
        }

        // -------- PHONE VALIDATION --------
        String phone;
        while (true) {
            System.out.print("Enter Phone (7-11 digits): ");
            phone = sc.nextLine();

            if (phone.matches("\\d{7,11}")) {
                break;
            } else {
                System.out.println("Invalid phone format!");
            }
        }

        // -------- MOBILE VALIDATION --------
        String mobile;
        while (true) {
            System.out.print("Enter Mobile (11 digits): ");
            mobile = sc.nextLine();

            if (mobile.matches("\\d{11}")) {
                break;
            } else {
                System.out.println("Invalid mobile format!");
            }
        }

        // Create Employee Object
        Employee emp = new Employee(name, department, salary, dob, phone, mobile);

        // -------- DATABASE INSERT --------
        /** try {

         Connection conn = DBConnection.getConnection();

         String sql = "INSERT INTO employee(name, department, salary, dob, phone, mobile) VALUES (?, ?, ?, ?, ?, ?)";

         PreparedStatement ps = conn.prepareStatement(sql);

         ps.setString(1, emp.name);
         ps.setString(2, emp.department);
         ps.setDouble(3, emp.salary);
         ps.setString(4, emp.dob);
         ps.setString(5, emp.phone);
         ps.setString(6, emp.mobile);

         ps.executeUpdate();//

         System.out.println("Employee data inserted successfully!");

         conn.close();/

         } catch (Exception e) {
         System.out.println("Database Error!");
         e.printStackTrace();
         }

         sc.close();**/

        System.out.println(emp);

    }
}
