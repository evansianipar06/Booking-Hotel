<%-- 
    Document   : logout
    Created on : Mar 4, 2021, 8:51:25 PM
    Author     : Win_10
--%>

<% 
session.invalidate(); //destroy session
response.sendRedirect("index.jsp");
%>
