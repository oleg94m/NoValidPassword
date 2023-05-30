import java.sql.*;
    public class Task5_2 {
        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/myjoinsdb1";
            String username = "root";
            String password = "admin";

            try (Connection connection = DriverManager.getConnection(url, username, password)) {
                String sql = "SELECT employees.phone, personal_info.birth_date " +
                        "FROM employees " +
                        "JOIN personal_info ON employees.id = personal_info.id " +
                        "WHERE personal_info.marital_status = 'single'";

                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(sql);

                while (resultSet.next()) {
                    String phone = resultSet.getString("phone");
                    Date birthDate = resultSet.getDate("birth_date");

                    System.out.println("Phone: " + phone + ", Birth Date: " + birthDate);
                }
            } catch (SQLException e) {
                System.out.println("Error connecting to database: " + e.getMessage());
            }
        }


}
