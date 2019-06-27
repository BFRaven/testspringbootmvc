<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<form:form method="POST" action="/contact"  modelAttribute="contact">

    <form:hidden path="contactId" />

<%--    First Name--%>
    <div>
        <label></label>
        <form:input path="firstName" />
    </div>

<%--    Last Name--%>
    <div>
        <label></label>
        <form:input path="lastName" />
    </div>

<%--       Address--%>
    <div>
        <label></label>
        <form:input path="address" />
    </div>

<%--    City--%>
    <div>
        <label></label>
        <form:input path="city" />
    </div>

<%--    State--%>
    <div>
        <label></label>
        <form:input path="state" />
    </div>

<%--    Zip Code--%>
    <div>
        <label></label>
        <form:input path="zipCode" />
    </div>

    <form:button> Add Contact </form:button>

</form:form>