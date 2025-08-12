package br.senac.controle.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.senac.modelo.dao.UsuarioDAO;
import br.senac.modelo.dao.UsuarioDAOImp;
import br.senac.modelo.entidade.Usuario;

//@WebServlet(urlPatterns = { "/cadastrar", "/entrar", "/sair" })
@WebServlet ("/")
public class UsuarioServlet extends HttpServlet {

    //private static final long serialVersionUID = 1L;
    private UsuarioDAO dao;

    public void init() {
        dao = new UsuarioDAOImp();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String action = request.getServletPath();

        try {

            switch (action) {

                case "/":
                    exibirPerfilUsuario(request, response);
                    break;

			/*case "/entrar":
				conectarUsuario(request, response);
				break;

			case "/sair":
				desconectarUsuario(request, response);
				*/

            }

        } catch (SQLException ex) {
            throw new ServletException(ex);
        }

    }

    private void exibirPerfilUsuario(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {

        String nome = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String apelido = request.getParameter("apelido");
        String email = request.getParameter("email");
        String senha = request.getParameter("senha");

        Usuario usuarioRecuperado = dao.recuperarUsuario(5);
        request.setAttribute("usuario", usuarioRecuperado);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

	/*private void conectarUsuario(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException, SQLException {

		String email = request.getParameter("email");
		String senha = request.getParameter("senha");

		Usuario usuario = dao.validarConexao(email, senha);

		if(usuario != null) {
		HttpSession session = request.getSession();
		session.setAttribute("usuarioLogado", usuario);
		response.sendRedirect("/");
		}

		else {
		request.setAttribute("erro", "Email ou senha incorretos");
		request.getRequestDispatcher("/login").forward(request, response);
		}

	}

	private void desconectarUsuario(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if(session != null) {
			session.invalidate();
		}

		response.sendRedirect("/login");
	}
*/
}
