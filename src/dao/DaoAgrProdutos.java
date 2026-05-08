package dao;

import bean.AgrProdutos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrProdutos extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrProdutos produto = (AgrProdutos) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_produtos values(?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, produto.getAgrIdFilme());
            pst.setString(2, produto.getAgrTitulo());
            pst.setString(3, produto.getAgrPlataforma());            
            pst.setString(4, produto.getAgrGenero());
            pst.setDouble(5, produto.getAgrPreco());
            pst.setDate(6, null);
            pst.setInt(7, produto.getAgrFkFornecedores());
            

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrProdutos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrProdutos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}