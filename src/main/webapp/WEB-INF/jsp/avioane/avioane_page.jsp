<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="../princCommand/header.jspf" %>
<%@ include file="../princCommand/navbar.jspf" %>

<div class="container mt-5">



    <div class="page">
            <%@include file="avion_form_start.jspf" %>
        </div>

            <div class="row">
                <%@include file="avion_form_dest.jspf" %>
            </div>

                <div class="row">
                    <%@include file="avion_form_date.jspf" %>
                </div>

    <div class="roww">
        <%@include file="avion_table.jspf" %>
    </div>


</div>
<%@ include file="../princCommand/footer.jspf" %>