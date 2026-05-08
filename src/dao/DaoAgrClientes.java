package dao;

import bean.AgrClientes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoAgrClientes extends DaoAbstract {

    @Override
    public void insert(Object object) {
        AgrClientes cliente = (AgrClientes) object;

        String url = "jdbc:mysql://10.7.0.51:33062/db_ana_roriz";
        String user = "ana_roriz";
        String password = "ana_roriz";
        String sql = "insert into agr_clientes values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection cnt = DriverManager.getConnection(url, user, password);
            PreparedStatement pst = cnt.prepareStatement(sql);

            pst.setInt(1, cliente.getAgrIdClientes());
            pst.setString(2, cliente.getAgrNomeCompleto());
            pst.setString(3, cliente.getAgrCpf());            
            pst.setString(4, cliente.getAgrEmail());
            pst.setDate(5, null);//Agr_dataNascimento
            pst.setString(6, cliente.getAgrRg());
            pst.setString(7, cliente.getAgrSexo());
            pst.setString(8, cliente.getAgrCep());
            pst.setString(9, cliente.getAgrEndereco());
            pst.setString(10, cliente.getAgrBairro());
            pst.setString(11, cliente.getAgrCidade());
            pst.setString(12, cliente.getAgrCelular());
            pst.setString(13, cliente.getAgrTelefoneResidencial());
            pst.setString(14, cliente.getAgrEstado());
            pst.setString(15, cliente.getAgrEscolaFaculdade());
            pst.setString(16, cliente.getAgrAtivo());

            pst.executeUpdate();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DaoAgrClientes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DaoAgrClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}