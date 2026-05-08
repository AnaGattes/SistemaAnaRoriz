package dao;

import bean.AgrVendedor;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrVendedor extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrVendedor vendedor = (AgrVendedor) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_vendedor values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, vendedor.getAgrIdVemdedor());
            pst.setString(2, vendedor.getAgrNomeCompleto());
            pst.setDate(3, null);//Agr_dataNascimento
            pst.setString(4, vendedor.getAgrCelular());            
            pst.setString(5, vendedor.getAgrEmail());            
            pst.setString(6, vendedor.getAgrCpf());
            pst.setString(7, vendedor.getAgrEndereco());
            pst.setString(8, vendedor.getAgrCidade());
            pst.setString(9, vendedor.getAgrAtivo());
            pst.setString(10, vendedor.getAgrEstado());


            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrVendedor.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrVendedor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}