package br.senac.modelo.factory.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoFactory {

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/seu_banco",
                    "seu_usuario",
                    "sua_senha"
            );
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o banco de dados", e);
        }
    }
}