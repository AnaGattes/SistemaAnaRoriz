/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

//import bean.AgrUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
//import testes.JdbcCrud;

/**
 *
 * @author u07740243132
 */
public class DaoAgrUsuarios extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrUsuarios agrUsuarios = (AgrUsuarios) object;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url, user, password;
            url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
            user= "ana_roriz";
            password = "ana_roriz";
            Connection cnt; 
            cnt = DriverManager.getConnection(url, user, password);
            String sql = "insert into mpv_usuarios values(?,?,?,?,?,?,?,?)";
            PreparedStatement pst = cnt.prepareStatement(sql);
            pst.setInt(1, agrUsuarios.getMpvIdUsuarios());
            pst.setString(2, agrUsuarios.getMpvNome());
            pst.setString(3, agrUsuarios.getMpvApelido());
            pst.setString(4, agrUsuarios.getMpvCpf());
            pst.setDate(5, null);//agr_datanascimento
            pst.setInt(6, agrUsuarios.getMpvNivel());
            pst.setString(7, agrUsuarios.getMpvSenha());
            pst.setString(8, agrUsuarios.getMpvAtivo());
            pst.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(JdbcCrud.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
