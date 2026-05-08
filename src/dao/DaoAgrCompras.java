package dao;

import bean.AgrCompras;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrCompras extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrCompras compra = (AgrCompras) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_compras values(?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, compra.getAgrIdVenda());
            pst.setInt(2, compra.getAgrFkFornecedor());
            pst.setDouble(3, compra.getAgrValorTotal());            
            pst.setString(4, compra.getAgrFormaPagamento());
            pst.setDate(5, null);//Agr_dataPagamento            
            pst.setInt(6, compra.getAgrFkUsuario());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrCompras.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrCompras.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}