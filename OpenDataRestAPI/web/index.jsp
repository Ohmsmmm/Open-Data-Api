<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>

<html>
<head>
    <title></title>
</head>

<body>
    <h3> Open Government Data of Thailand</h3>

    <form action="ApiServlet" method="post">

    <h4> Choose API: </h4>
         <input type=radio name="status" value="1">สถานีรับส่งผู้โดยสารการรถไฟแห่งประเทศไทย<br><br>
         <input type=radio name="status" value="2">ขบวนรถไฟสำหรับรับ-ส่งผู้โดยสาร<p>

       &nbsp &nbsp <input type=submit value="Submit">
     </form>
</body>
</html>

    