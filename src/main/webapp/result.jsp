<%@ page import ="java.util.*" %>
<!DOCTYPE html>
<html>
<body>
<center>
<h1>
    Available Brands are listed below:
</h1>
<%
List result= (List) request.getAttribute("brands");
Iterator it = result.iterator();
while(it.hasNext()){
out.println("\b "+it.next()+"<br>");

}
%>
</body>
</html>