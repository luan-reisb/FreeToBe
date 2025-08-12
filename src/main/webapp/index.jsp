<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>

  <head>
    <title>Perfil Usuario</title>
  </head>

  <body>
    <h1>
      <div style="text-align: center;">
        Perfil
      </div>
    </h1>
    <h2>
      <div style="text-align: center;">
        Dados Usuarios
      </div>
    </h2>

    <div style="text-align: center;">
      <form>
        <div style="display: flex; flex-direction: column;">
          <label for="nome">Nome:</label>
          <input type="text" id="nome" name="nome" <c:out value="${usuario.nome}"/>>
        </div>

        <div style="display: flex; flex-direction: column;">
          <label for="sobrenome">Sobrenome:</label>
          <input type="text" id="sobrenome" name="sobrenome" <c:out value="${usuario.sobrenome}"/>>
        </div>

        <div style="display: flex; flex-direction: column;">
          <label for="pronome">Pronome:</label>
          <input type="text" id="pronome" name="pronome" <c:out value="${usuario.pronome}"/>>
        </div>

        <div style="display: flex; flex-direction: column;">
          <label for="apelido">Apelido:</label>
          <input type="text" id="apelido" name="apelido" <c:out value="${usuario.apelido}"/>>
        </div>

        <div style="display: flex; flex-direction: column;">
          <label for="email">Email:</label>
          <input type="email" id="email" name="email" <c:out value="${usuario.email}"/>>
        </div>

      </form>
    </div>

  </body>

</html>
