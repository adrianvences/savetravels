

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tacos</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/jquery/jquery.min.js"></script>
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
    <!-- form -->
<h1 class="text-center bg-dark text-light mt-3">Edit an expense:</h1>

<div class="container">
  <div class="card">
    <div class="card-body">
      <form:form action="/travels/${travel.id}" method="post" modelAttribute="travel">
        <input type="hidden" name="_method" value="put">
        <div class="form-control bg-warning mb-3">
          <form:label path="expense">Expense:</form:label>
          <form:errors path="expense"></form:errors>
          <form:input path="expense"></form:input>
        </div>

        <div class="form-control bg-warning mb-3">
          <form:label path="vendor">Vendor:</form:label>
          <form:errors path="vendor"></form:errors>
          <form:input path="vendor"></form:input>
        </div>

        <div class="form-control bg-warning mb-3">
          <form:label path="amount">Amount:</form:label>
          <form:errors path="amount"></form:errors>
          <form:input path="amount"></form:input>
        </div>

        <div class="form-control bg-warning mb-3">
          <form:label path="description">Description:</form:label>
          <form:errors path="description"></form:errors>
          <form:input path="description"></form:input>
        </div>

        <input class="btn btn-dark text-light mt-3" type="submit" value="edit travel">

      </form:form>
      <a class="btn btn btn-secondary mt-3 border-solid" href="/">Go back</a>
    </div>
  </div>
</div>
</body>
</html>



