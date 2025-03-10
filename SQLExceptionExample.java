

import java.sql.*;

class SQLExceptionExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/wrongDB", "user", "pass");
        } catch (SQLException e) {
            System.out.println("SQLException caught");
        }
    }
}

