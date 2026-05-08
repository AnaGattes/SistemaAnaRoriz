package dao;

import bean.AgrUsuarios;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrUsuarios extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrUsuarios usuario = (AgrUsuarios) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_usuarios values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, usuario.getAgrIdUsuarios());
            pst.setString(2, usuario.getAgrNome());
            pst.setString(3, usuario.getAgrApelido());            
            pst.setString(4, usuario.getAgrCpf());
            pst.setDate(5, null);//Agr_dataNascimento
            pst.setString(6, usuario.getAgrSenha());
            pst.setInt(7, usuario.getAgrNivel());
            pst.setString(8, usuario.getAgrAtivo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}