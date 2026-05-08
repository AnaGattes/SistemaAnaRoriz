package dao;

import bean.AgrComprasProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrComprasProduto extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrComprasProduto compraProduto = (AgrComprasProduto) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_compras_produto values(?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, compraProduto.getAgrIdItensVenda());
            pst.setInt(2, compraProduto.getAgrIdVendas());
            pst.setInt(3, compraProduto.getAgrIdFilmes());
            pst.setInt(4, compraProduto.getAgrQuantidade());
            pst.setDouble(5, compraProduto.getAgrValorVendas());            
            pst.setDouble(6, compraProduto.getAgrSubtotalItens());            
            pst.setDouble(7, compraProduto.getAgrDescontoItens());            
            pst.setString(8, compraProduto.getAgrTipo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrComprasProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrComprasProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}