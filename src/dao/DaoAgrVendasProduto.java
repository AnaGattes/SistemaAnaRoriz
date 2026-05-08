package dao;

import bean.AgrVendasProduto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrVendasProduto extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrVendasProduto produto = (AgrVendasProduto) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_vendas_produto values(?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, produto.getAgrIdVendasProdutos());
            pst.setDate(2, null);//agr_data_venda_produto
            pst.setDouble(3, produto.getAgrValorTotal());
            pst.setString(4, produto.getAgrFormaPagamento());            
            pst.setInt(5, produto.getAgrFkVenda());
            pst.setInt(6, produto.getAgrFkProduto());
            

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrVendasProduto.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrVendasProduto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}