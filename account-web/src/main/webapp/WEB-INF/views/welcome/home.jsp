<div id="wrapper">
    <h1 id="title">Hello world!</h1>
    <p>The time on the server is ${serverTime}.</p>
    
      <!--provide an html table start tag -->
   <table style="border: 1px solid;">
   <!-- iterate over the collection using forEach loop -->
   <c:forEach var="result" items="${accountList}">
       <!-- create an html table row -->
       <tr>
       <!-- create cells of row -->
       <td>${result.userId}</td>
       <td>${result.userName}</td>
       <td>${result.birthDay}</td>
       <td>${result.address}</td>
       <td>${result.phoneNumber}</td>
       <!-- close row -->
       </tr>
       <!-- close the loop -->
   </c:forEach>
   <!-- close table -->
   </table>  
    
    
</div>
