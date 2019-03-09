<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="../princCommand/header.jspf" %>
<%@ include file="../princCommand/navbar.jspf" %>

<div class="container mt-5">


    <div class="row">
        <%@include file="client_form.jspf" %>
    </div>
    <div class="row">
        <%@include file="client_table.jspf" %>
    </div>
</div>
<%@ include file="../princCommand/footer.jspf" %>
