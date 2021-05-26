<%-- 
    Document   : login
    Created on : Mar 7, 2021, 7:01:45 PM
    Author     : Win_10
--%>

<%@ page import="java.sql.*" %>  

<%
if(session.getAttribute("login")!=null) //check login session user not access or back to index.jsp page
{
	response.sendRedirect("dashboard.jsp");
}
%>

<%
try
{
	Class.forName("com.mysql.jdbc.Driver"); //load driver
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_kamar_hotel2","root",""); //create connection
	
	if(request.getParameter("btn_login")!=null) //check login button click event not null
	{
            String dbemail,dbpassword;
            String email,password;		
            email=request.getParameter("txt_email"); //txt_email
            password=request.getParameter("txt_password"); //txt_password

            PreparedStatement pstmt=null; //create statement

            pstmt=con.prepareStatement("SELECT * FROM login WHERE email=? AND password=?"); //sql select query 
            pstmt.setString(1,email);
            pstmt.setString(2,password);

            ResultSet rs=pstmt.executeQuery(); //execute query and store in resultset object rs.
            if(rs.next())
            {
                dbemail=rs.getString("email");
                dbpassword=rs.getString("password");

                if(email.equals(dbemail) && password.equals(dbpassword))
                {
                    session.setAttribute("login",dbemail); //session name is login and store fetchable database email address
                    response.sendRedirect("index.jsp"); //after login success redirect to index.jsp page
                }
            }
            else
            {
                request.setAttribute("errorMsg","Pastikan email dan password anda benar"); //invalid error message for email or password wrong
            }

            con.close(); //close connection	
	}
	
}
catch(Exception e)
{
   out.println(e);
}
%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Login</title>

    <link rel="stylesheet" href="css/main.css">
    <link rel="stylesheet" href="css/login-register.css">
	
    <script>
        function validate()
        {
            var email = document.myform.txt_email;
            var password = document.myform.txt_password;

            if (email.value == null || email.value == "") //check email textbox not blank
            {
                window.alert("Masukkan Email !"); //alert message
                email.style.background = '#f08080';
                email.focus();
                return false;
            }
            if (password.value == null || password.value == "") //check password textbox not blank
            {
                window.alert("Masukkan Password !"); //alert message
                password.style.background = '#f08080'; 
                password.focus();
                return false;
            }
        }

    </script>
	<link href="css/bootstrap.css" rel="stylesheet"/>
</head>

<body>

    <div class="main-content">
        <form class="form-register" method="post" name="myform" onsubmit="return validate();">
            <div class="form-register-with-email">
                <div class="form-white-background">
                    <div class="form-title-row">
                        <h1>Login</h1>
                    </div>					
                        <p style="color:red">				   		
                        <%
                        if(request.getAttribute("errorMsg")!=null)
                        {
                             out.println(request.getAttribute("errorMsg")); //error message for email or password 
                        }
                        %>
                        </p>

                   </br>
                    <div class="input-group mb-3">
                        <span class="input-group-text">Email</span>
                        <input type="email" class="form-control" id="email" name="txt_email" placeholder="Email" aria-label="Email" aria-describedby="basic-addon1">
                    </div>
                    
                   <div class="input-group mb-3">
                        <span class="input-group-text">Password</span>
                        <input type="password" class="form-control" name="txt_password" id="password" placeholder="Password">
                  </div>
                  <button type="submit" class="btn btn-primary" name="btn_login">Login</button>
                  <br>
                  Belum punya akun?<a href="register.jsp" > <b> Daftar Disini !</b></a>
                </div>    
            </div>
        </form>
    </div>
</body>
</html>