<%-- 
    Document   : home
    Created on : 7-Oct-2022, 11:12:09 PM
    Author     : Hanin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
    </head>
    <body>
        <h1>Home Page</h1>
        <h4> Hello ${name} </h4>
          <form  action="login" method = "post">
                     <a href="login?logout" >logout</a>
                 </form>
     
    </body>
</html>
