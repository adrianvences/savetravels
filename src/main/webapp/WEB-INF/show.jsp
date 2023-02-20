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

    <div class="container mt-3 border-solid" style="width: 50%;">
      <div class="card bg-primary">
        <h1 class="text-light text-center">One Expense</h1>
        <div class="card-body bg-dark">
          <h2 class="text-light text-center">Expense name : ${travel.expense} </h1>
          <h3 class="text-light text-center">Vendor : ${travel.vendor}</h2>
          <h3 class="text-light text-center">Amount spent : ${travel.amount}</h2>
          <h3 class="text-light text-center">Expense Description : ${travel.description}</h2>
        </div>
        <a class="btn btn btn-secondary mt-3 border-solid" href="/">Add an expense / Go back</a>
      </div>
    </div>
  
  
      </div>
    </div>

</body>
</html>
