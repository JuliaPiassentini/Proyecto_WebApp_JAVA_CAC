package edu.ar.data;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    //Atributos,dirección del servidor de la base datos utilizada,en mi compu ouna externa más las credenciales de acceso a ella,se definene como CONSTANTES  y privadas con finally y mayuscula

  private final static String JDBC_URL = 
  "jdbc:mysql://127.0.0.1:3306/pelis_web_primerabase?useSSL=false&useTimeZone=true&serverTimeZone=UTC&allowPublicKeyReference=true";
  private final static String JDBC_USER = ".......";
   //Ingresan su contraseña para acceder a la base de datos,la de workbench
  private final static String JDBC_PASS = ".....";


  public static DataSource getDataSource() {
    BasicDataSource ds = new BasicDataSource();
    ds.setUrl(JDBC_URL);
    ds.setUsername(JDBC_USER);
    ds.setPassword(JDBC_PASS);
    ds.setInitialSize(100);
    return ds;
  }

  public static Connection getConexion() throws SQLException {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
    } catch(ClassNotFoundException e){
      e.printStackTrace(System.out);
    }
    return getDataSource().getConnection();
  }

  public static void close(ResultSet rs) throws SQLException {
    rs.close();
  }

  public static void close(Statement st) throws SQLException {
    st.close();
  }

  public static void close(Connection cn) throws SQLException {
    cn.close();
  }
}
