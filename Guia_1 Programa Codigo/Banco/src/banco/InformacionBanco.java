/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.sql.*;
import java.util.*;


/**
 * Mantiene la informacion del Inventario
 * @author Edgar
 */
public class InformacionBanco {
    private String nombreBanco;
    private String direccionBanco;
    private int telefonoBanco;

    public InformacionBanco(String nombreBanco, String direccionBanco, int telefonoBanco) {
        this.nombreBanco = nombreBanco;
        this.direccionBanco = direccionBanco;
        this.telefonoBanco = telefonoBanco;
    }
    
    //-----------------------------------GETTERS----------------------------------- 

    public String getNombreBanco() {
        return nombreBanco;
    }

    public String getDireccionBanco() {
        return direccionBanco;
    }

    public int getTelefonoBanco() {
        return telefonoBanco;
    }
    
    //-----------------------------------PRINT OUT----------------------------------- 

    @Override
    public String toString() {
        return "InformacionBanco{" + "nombreBanco=" + nombreBanco + ", direccionBanco=" + direccionBanco + ", telefonoBanco=" + telefonoBanco + '}';
    }
    
    //-----------------------------------CONEXION------------------------------------
    static Connection conexión;
    
    public static void abrirConexión() {
        try {
            Class.forName("org.h2.Driver");
            conexión = DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
        }
        catch(Exception ex) {
            conexión = null;
            System.err.println( "Error de conexión con la BD" );
            ex.printStackTrace();
        }
    }
    
    public static void cerrarConexión() {
        try {
            if (conexión != null) {
                conexión.close();
            }
        }
        catch (Exception ex) {}
    }    
    
    //----------------------------Guardar Cuenta-------------------------
    
    public static void guardarCuenta(Partes u) {
        PreparedStatement ps;
        String sql = "INSERT INTO INVENTARIO VALUES (?, ?, ?, ?, ?)";
        
        try {
            ps = conexión.prepareStatement(sql);
            ps.setInt(1, u.getNumeroCuenta());
            ps.setString(2, u.getNombreTitular());
            ps.setInt(3, u.getApellidoTitular());
            ps.setInt(4, u.getCedulaTitular());
            ps.setString(5, u.getMonto());
            
            ps.executeUpdate();
            
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
            
        
    }
    
    public static List<Partes> obtenerCuentas(){
        List<Partes> user = new ArrayList<>();
        try {
            Statement st;
            String sql = "SELECT * FROM INVENTARIO";
            
            st = conexión.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME");
                int cantidad = rs.getInt("CANTIDAD");
                int value = rs.getInt("VALUE");
                String estado = rs.getString("ESTADO");
                
                Partes usu = new Partes(id, name, cantidad, value, estado);
                user.add(usu);
            }
            rs.close();
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }
    
    
        public static void modificarCuenta(Partes u) {
        PreparedStatement ps;
        String sql = "UPDATE INVENTARIO SET NAME = (?), CANTIDAD = (?), VALUE = (?), ESTADO = (?) WHERE ID = (?)";
        
        try {
            ps = conexión.prepareStatement(sql);
            ps.setString(1, u.getNombreTitular());
            ps.setInt(2, u.getApellidoTitular());
            ps.setInt(3, u.getCedulaTitular());
            ps.setString(4, u.getMonto());
            ps.setInt(5, u.getNumeroCuenta());
            
            ps.executeUpdate();
            
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
            
        
    }
        
            public static void eliminarCuenta(Partes u) {
        PreparedStatement ps;
        String sql = "DELETE FROM INVENTARIO WHERE ID=(?);";
        
        try {
            ps = conexión.prepareStatement(sql);
            ps.setInt(1, u.getNumeroCuenta());
            
            ps.executeUpdate();
            
            
        }
        catch (Exception ex) {
            ex.printStackTrace();
        }
            
        
    }    
        
        
        
        
}
