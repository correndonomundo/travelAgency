<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="../princCommand/header.jspf" %>
<%@ include file="../princCommand/navbar.jspf" %>

<div class="container mt-5">


    <div class="row">
        <%@include file="hotel_form_dest.jspf" %>
    </div>
    <div class="row">
            <%@include file="hotel_form_name.jspf" %>
        </div>
    <div class="row">
        <%@include file="hotel_table.jspf" %>
    </div>


</div>
<%@ include file="../princCommand/footer.jspf" %>
