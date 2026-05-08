package dao;

import bean.AgrVendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrVendas extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrVendas produto = (AgrVendas) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_vendas values(?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, produto.getAgrIdVendasProduto());
            pst.setDouble(2, produto.getAgrValorUnitario());
            pst.setString(3, produto.getAgrFormaPagamento());            
            pst.setInt(4, produto.getAgrFkClientes());
            pst.setInt(5, produto.getAgrFkVendedor());
            

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrVendas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrVendas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}