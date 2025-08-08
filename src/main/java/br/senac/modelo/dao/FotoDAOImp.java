package br.senac.modelo.dao;


import br.senac.modelo.entidade.Foto;
import br.senac.modelo.factory.conexao.ConexaoFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class FotoDAOImp implements FotoDAO{
    private ConexaoFactory conexao;

    public FotoDAOImp() {
        conexao = new ConexaoFactory();
    }

    @Override
    public void adicionarFoto(Foto foto) {

        String sql = "INSERT INTO foto (id, caminhoArquivo, conteudoFoto) VALUES (?, ?, ?)";

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setLong(1, foto.getId());
            stmt.setString(2, foto.getCaminhoArquivo());
            stmt.setBytes(3, foto.getConteudoFoto());
            stmt.executeUpdate();
            stmt.close();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    foto.setId(rs.getLong(1));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarFoto(Foto foto) {
        String sql = "DELETE FROM foto WHERE id = ?";

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, foto.getId());
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Foto deletada com sucesso!");
            } else {
                System.out.println("Nenhuma foto encontrada com o ID fornecido.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void atualizarFoto(Foto foto) {
        String sql = "UPDATE foto SET caminhoArquivo = ?, conteudoFoto = ? WHERE id = ?";

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, foto.getCaminhoArquivo());
            stmt.setBytes(2, foto.getConteudoFoto());
            stmt.setLong(3, foto.getId());

            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Foto atualizada com sucesso!");
            } else {
                System.out.println("Nenhuma foto encontrada com o ID fornecido.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public Foto recuperarFoto(Foto foto) {
        String sql = "SELECT id, caminhoArquivo, conteudoFoto FROM foto WHERE id = ?";
        //Foto foto = null;

        try (Connection conn = conexao.getConexao();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setLong(1, foto.getId());

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                   // foto = new Foto();
                    foto.setId(rs.getLong("id"));
                    foto.setCaminhoArquivo(rs.getString("caminhoArquivo"));
                    foto.setConteudoFoto(rs.getBytes("conteudoFoto"));
                } else {
                    System.out.println("Nenhuma foto encontrada com o ID fornecido.");
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return foto;
    }
}
