<%-- 
    Document   : login
    Created on : 7-Oct-2022, 11:11:08 PM
    Author     : Hanin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <h1>Login</h1>
        <form method="post" action="login">
            Username:<input type="text" name="name" value=${name} ><br>
            Password:<input type="password" name="password" value=${password}><br>
            <p>${msg}</p> 
            <input type="submit" value="log in" >
        </form>
          
                 
    </body>
</html>
