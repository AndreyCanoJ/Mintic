/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.reto5.modelo.DAO;

import com.mycompany.reto5.modelo.VO.Lider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Andrey Cano
 */
public class PrimeraConsulta {
    
    public void primerconsulta(DefaultTableModel modelo) {
        
        Lider lider = new Lider();
        
        try{
            Conexion cc = new Conexion();
            Connection cn = cc.conectar();
            
            Statement st = cn.createStatement();
            
            ResultSet rs = st.executeQuery("SELECT ID_Lider,Nombre,Primer_Apellido,Ciudad_Residencia FROM Lider ORDER BY Ciudad_Residencia");
            
            
            while(rs.next()){
                
                lider.setID_Lider(rs.getInt(1));
                lider.setNombre(rs.getString(2));
                lider.setPrimer_Apellido(rs.getString(3));
                lider.setCiudad_Residencia(rs.getString(4));
                
                modelo.addRow(new Object[]{lider.getID_Lider(), lider.getNombre(), lider.getPrimer_Apellido(), lider.getCiudad_Residencia()});
            }
                   rs.close();
                   cn.close();
                    
        } catch (SQLException ex) {
            Logger.getLogger(PrimeraConsulta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
