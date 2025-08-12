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
      Dados Usuários
    </div>
  </h2>

  <div style="text-align: center;">
    <div style="display: flex; flex-direction: column; align-items: center;">

      <p><strong>Nome:</strong> <c:out value="${usuario.nome}"/></p>
      <p><strong>Sobrenome:</strong> <c:out value="${usuario.sobrenome}"/></p>
      <p><strong>Pronome:</strong> <c:out value="${usuario.pronome}"/></p>
      <p><strong>Apelido:</strong> <c:out value="${usuario.apelido}"/></p>
      <p><strong>Email:</strong> <c:out value="${usuario.email}"/></p>

    </div>
  </div>

</body>
</html>
