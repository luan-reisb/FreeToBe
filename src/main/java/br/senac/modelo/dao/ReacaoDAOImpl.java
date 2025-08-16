package br.senac.modelo.dao;

import br.senac.modelo.entidade.Reacao;
import br.senac.modelo.entidade.TipoReacao;
import br.senac.modelo.factory.conexao.ConexaoFactory;

import java.sql.*;

public class ReacaoDAOImpl implements ReacaoDAO {
    private ConexaoFactory conexao;

    public ReacaoDAOImpl() {
        conexao = new ConexaoFactory();
    }


    @Override
    public void adicionarReacao(Reacao reacao) {

        String sql = "INSERT INTO reacao (tipoReacao, usuario_id) VALUES (?, ?)";

        try (Connection connection = conexao.getConexao();
             PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, reacao.getTipoReacao().tipoReacao);
            stmt.setLong(2, reacao.getUsuario().getId());
            stmt.executeUpdate();
            stmt.close();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    reacao.setId(rs.getLong(1));
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void atualizarReacao(Reacao reacao) {
        String sql = "UPDATE reacao SET tipoReacao = ? WHERE id = ?";

        try (Connection connection = conexao.getConexao();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setString(1, reacao.getTipoReacao().tipoReacao);
            stmt.setLong(2, reacao.getId());
            stmt.close();

            int rowsUpdated = stmt.executeUpdate();

            if (rowsUpdated == 0) {
                System.out.println("Nenhuma reação encontrada para atualizar com id: " + reacao.getId());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deletarReacao(Reacao reacao) {
        String sql = "DELETE FROM reacao WHERE id = ?";

        try (Connection connection = conexao.getConexao();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setLong(1, reacao.getId());

            int rowsDeleted = stmt.executeUpdate();

            if (rowsDeleted == 0) {
                System.out.println("Nenhuma reação encontrada para deletar com id: " + reacao.getId());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Reacao recuperarReacao(Reacao reacao) {
        String sql = "SELECT id, tipoReacao FROM reacao WHERE id = ?";

        try (Connection connection = conexao.getConexao();
             PreparedStatement stmt = connection.prepareStatement(sql)) {

            stmt.setLong(1, reacao.getId());

            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    reacao.setTipoReacao(TipoReacao.valueOf(rs.getString("tipoReacao")));
                } else {
                    System.out.println("Nenhuma reação encontrada com id: " + reacao.getId());
                }
                return reacao;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return reacao;
        }
    }
}