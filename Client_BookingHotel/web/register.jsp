<%@ page import="java.sql.*" %>  

<%
if(session.getAttribute("login")!=null) //check login session user not access or back to register.jsp page
{
    response.sendRedirect("dashboard.jsp");
}
%>

<%
try
{
    Class.forName("com.mysql.jdbc.Driver"); //load driver
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/booking_kamar_hotel2","root",""); //create connection
    if(request.getParameter("btn_register")!=null) //check register button click event not null
    {
        String firstname,lastname,email,password;
        firstname=request.getParameter("txt_firstname"); //txt_firstname
        lastname=request.getParameter("txt_lastname"); //txt_lastname
        email=request.getParameter("txt_email"); //txt_email
        password=request.getParameter("txt_password"); //txt_password

        PreparedStatement pstmt=null; //create statement

        pstmt=con.prepareStatement("insert into login(firstname,lastname,email,password) values(?,?,?,?)"); //sql insert query
        pstmt.setString(1,firstname);
        pstmt.setString(2,lastname);
        pstmt.setString(3,email);
        pstmt.setString(4,password);

        pstmt.executeUpdate(); //execute query
        request.setAttribute("successMsg","Registrasi Akun Berhasil !!!"); //register success messeage
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
		
	<title>Register</title>
<link href="css/bootstrap.css" rel="stylesheet"/>
	<link rel="stylesheet" href="css/main.css">
	<link rel="stylesheet" href="css/login-register.css">
	
	<!-- javascript for registeration form validation-->
	<script>	
		function validate()
		{
                    var first_name= /^[a-z A-Z]+$/; //pattern allowed alphabet a-z or A-Z 
                    var last_name= /^[a-z A-Z]+$/; //pattern allowed alphabet a-z or A-Z 
                    var email_valid= /^[\w\d\.]+\@[a-zA-Z\.]+\.[A-Za-z]{1,4}$/; //pattern valid email validation
                    var password_valid=/^[A-Z a-z 0-9 !@#$%&*()<>]{6,12}$/; //pattern password allowed A to Z, a to z, 0-9, !@#$%&*()<> charecter 
			
                    var fname = document.getElementById("fname"); //textbox id fname
                    var lname = document.getElementById("lname"); //textbox id lname
                    var email = document.getElementById("email"); //textbox id email
                    var password = document.getElementById("password"); //textbox id password
			
                    if(!first_name.test(fname.value) || fname.value=='') 
                    {
			alert("Nama depan harus bersifat Alphabetis");
                        fname.focus();
                        fname.style.background = '#f08080';
                        return false;                    
                    }
                    if(!last_name.test(lname.value) || lname.value=='') 
                    {
			alert("Nama Belakang harus bersifat Alphabetis");
                        lname.focus();
                        lname.style.background = '#f08080';
                        return false;                    
                    }
                    if(!email_valid.test(email.value) || email.value=='') 
                    {
                        alert("Masukkan Password !");
                        email.focus();
                        email.style.background = '#f08080';
                        return false;                    
                    }
                    if(!password_valid.test(password.value) || password.value=='') 
                    {
                        alert("Password harus 6 - 12 karakter dan mengikuti karakter !@#$%&*()<>");
                        password.focus();
                        password.style.background = '#f08080';
                        return false;                    
                    }
		}
		
	</script>	

</head>

<body>
    
    <div class="main-content">
        <form class="form-register" method="post" onsubmit="return validate();">
            <div class="form-register-with-email">
                <div class="form-white-background">
                   <div class="form-title-row">
                        <h1>Register</h1>
                    </div>		   
                        <p style="color:green">				   		
                        <%
                        if(request.getAttribute("successMsg")!=null)
                        {
                            out.println(request.getAttribute("successMsg")); //register success message
                        }
                        %>
                        </p>

                        </br>
                    
                    <div class="form-row">
                        <label>
                            <span>Nama Depan</span>
                            <input type="text" name="txt_firstname" id="fname" placeholder="Nama Depan Anda...">
                        </label>
                    </div>
					<div class="form-row">
                        <label>
                            <span>Nama Belakang</span>
                            <input type="text" name="txt_lastname" id="lname" placeholder="Nama Belakang Anda...">
                        </label>
                    </div>

                    <div class="form-row">
                        <label>
                            <span>Email</span>
                            <input type="text" name="txt_email" id="email" placeholder="Email Anda...">
                        </label>
                    </div>

                    <div class="form-row">
                        <label>
                            <span>Password</span>
                            <input type="password" name="txt_password" id="password" placeholder="Password Anda...">
                        </label>
                    </div>
			<input type="submit" class="btn btn-primary" name="btn_register" value="Register" style="color: white">		
                        <br><br><br><br>
                        <a href="index.jsp" class="form-log-in-with-existing">Sudah punya akun ? <b> Login Disini </b></a>
                </div>		
            </div>
        </form>
    </div>
</body>
</html>
