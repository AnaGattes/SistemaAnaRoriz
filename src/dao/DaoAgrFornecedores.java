package dao;

import bean.AgrFornecedores;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrFornecedores extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrFornecedores fornecedor = (AgrFornecedores) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_fornecedores values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, fornecedor.getAgrIdFornecedores());
            pst.setString(2, fornecedor.getAgrNome());
            pst.setString(3, fornecedor.getAgrNomeSocial());            
            pst.setString(4, fornecedor.getAgrCnpj());
            pst.setString(5, fornecedor.getAgrInscricao());
            pst.setString(6, fornecedor.getAgrEmail());
            pst.setString(7, fornecedor.getAgrTelefone());
            pst.setString(8, fornecedor.getAgrContato());
            pst.setString(9, fornecedor.getAgrCep());
            pst.setString(10, fornecedor.getAgrEndereco());
            pst.setString(11, fornecedor.getAgrBairro());
            pst.setString(12, fornecedor.getAgrCidade());
            pst.setString(13, fornecedor.getAgrEstado());
            pst.setString(14, fornecedor.getAgrAtivo());
            pst.setString(15, fornecedor.getAgrNomeEmpresa());
            pst.setString(16, fornecedor.getAgrNomeResponsavel());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrFornecedores.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}