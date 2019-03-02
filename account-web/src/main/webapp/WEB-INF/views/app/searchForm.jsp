<h1> Search Form</h1>
<form:form modelAttribute="searchForm"
    action="${pageContext.request.contextPath}/abc/search">
    <form:label path="userId">userId</form:label>
    <form:input path="userId" />
    <form:errors path="userId" />
    <br>
    <form:label path="userName">userName</form:label>
    <form:input path="userName" />
    <form:errors path="userName" />
    <br>
    <form:label path="birthDay">birthDay</form:label>
    <form:input path="birthDay" />
    <form:errors path="birthDay" />
    <br>
    <form:label path="address">address</form:label>
    <form:input path="address" />
    <form:errors path="address" />
    <br>
    <form:label path="phoneNumber">phoneNumber</form:label>
    <form:input path="phoneNumber" />
    <form:errors path="phoneNumber" />
    <br>
    <input type="submit" name="search" value="search" /> <!-- (1) -->
</form:form>