<h1>Abc Create Form</h1>
<form:form modelAttribute="accountForm"
    action="${pageContext.request.contextPath}/abc/create">
    <form:label path="userId">userId</form:label>
        ${f:h(accountForm.userId)}
    <form:hidden path="userId" /> <!-- (1) -->
    <br>
    <form:label path="userName">userName</form:label>
        ${f:h(accountForm.userName)}
    <form:hidden path="userName" /> <!-- (1) -->
    <br>
    <form:label path="birthDay">birthDay</form:label>
        ${f:h(accountForm.birthDay)}
    <form:hidden path="birthDay" /> <!-- (1) -->
    <br>
    <form:label path="address">address</form:label>
        ${f:h(accountForm.address)}
    <form:hidden path="address" /> <!-- (1) -->
    <br>
    <form:label path="phoneNumber">phoneNumber</form:label>
        ${f:h(accountForm.phoneNumber)}
    <form:hidden path="phoneNumber" /> <!-- (1) -->
    <br>
    <input type="submit" name="redo" value="Back" /> <!-- (2) -->
    <input type="submit" value="Create" /> <!-- (3) -->
</form:form>