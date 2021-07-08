package View;

import java.sql.*;


public class ConnectionFactory {
    private static final String DRIVER= "com.mysql.cj.jdbc.Driver";
    private static final String URL= "jdbc:mysql://localhost:3306/projeto";
    private static final String USER= "root";
    private static final String PASS= "32346361121";

    public static Connection getConnection(){

        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (Exception e) {
            throw new RuntimeException("Erro na conexão", e);
        }
    }

    public static void closeConnection(Connection c){
        if(c != null){
            try {
                c.close();
            } catch (SQLException e) {
                throw new RuntimeException("Deu erro na hora de fechar!", e);
            }
        }
    }

    public static void closeConnection(Connection c, PreparedStatement s){
        closeConnection(c);

        if(s != null){
            try {
                s.close();
            } catch (SQLException e) {
                throw new RuntimeException("Deu erro na hora de fechar!", e);
            }
        }
    }

    public static void closeConnection(Connection c, PreparedStatement s, ResultSet r){
        closeConnection(c,s);

        if(r != null){
            try {
                r.close();
            } catch (SQLException e) {
                throw new RuntimeException("Deu erro na hora de fechar!", e);
            }
        }
    }

}
