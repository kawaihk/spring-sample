<html>
<head>
<meta charset="utf-8">
<title>List</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>
<div id="wrapper">
  <h1>Find Account</h1>
  <fieldset>
    <legend>Find Condition</legend>
    <form:form method="get" modelAttribute="searchForm">
      <div>
	    <form:label path="userId">userId</form:label>
	    <form:input path="userId" />
	    <form:errors path="userId" />
      </div>
      <div>
	    <form:label path="userName">userName</form:label>
	    <form:input path="userName" />
	    <form:errors path="userName" />
      </div>
	    <form:label path="birthDay">birthDay</form:label>
	    <form:input path="birthDay" />
	    <form:errors path="birthDay" />
      <div>
	    <form:label path="address">address</form:label>
	    <form:input path="address" />
	    <form:errors path="address" />
      </div>
      <div>
	    <form:label path="phoneNumber">phoneNumber</form:label>
	    <form:input path="phoneNumber" />
	    <form:errors path="phoneNumber" />
      </div>
      <form:button>Find</form:button>
    </form:form>
  </fieldset>
  <hr>
  <fieldset>
    <legend>Account by Condition</legend>
    <c:choose>
      <c:when test="${page != null && page.totalPages != 0}">
        <t:pagination page="${page}" criteriaQuery="${f:query(findForm)}" outerElementClass="pagination" />
        <table>
          <thead>
            <tr>
              <th>No.</th>
              <th>Title</th>
              <th>Created</th>
              <th>Status</th>
            </tr>
          </thead>
          <tbody>
            <c:set var="baseCount" value="${page.number * page.size}" />
            <c:forEach var="result" items="${page.content}" varStatus="status">
              <tr>
                <td>${baseCount + status.count}</td>
                <!-- (1) -->
		       <td>${result.userId}</td>
		       <td>${result.userName}</td>
		       <td>${result.birthDay}</td>
		       <td>${result.address}</td>
		       <td>${result.phoneNumber}</td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </c:when>
      <c:otherwise>
        Not found...
      </c:otherwise>
    </c:choose>
  </fieldset>
</div>   
</body>
</html>