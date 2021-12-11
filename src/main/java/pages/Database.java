package pages;

import java.sql.*;
import java.util.regex.Matcher;

public class Database {

    public void setUpConn()throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database","root","nGlatko90");
        //ubaci u bazu naziv i cenu
        //PreparedStatement statement = connection.prepareStatement("insert into rogers_mobiles(mobile_name, price) values(?,?)");
        //statement.setString(1, name);

        // prikazi mi sve iz baze gde je kolona MOBILE_NAME
        String query = "select mobile_name from rogers_mobiles";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            String model = resultSet.getString("mobile_name");
            System.out.println(model);
        }
//        statement.setString(1, ime);
//        statement.setInt(2, 1000);
        statement.close();
    }
}
