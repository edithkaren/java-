<html>
<head>
</head>
<body bgcolor="#f09970">
<br>
<br>
<br>
<h2><center>Welcome&nbsp;&nbsp;<%=session.getAttribute("uname")%></center></h2>
<%@ page import="java.sql.*" %>
<%
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
Connection con=DriverManager.getConnection("jdbc:odbc:health","health","health");
String dname=(String)session.getAttribute("uname");
PreparedStatement stmt=con.prepareStatement("select * from patient_details where visitdoctor=?;");
stmt.setString(1,dname);
String pid[]=new String[1000];
ResultSet rs=stmt.executeQuery();
int no=0;%>
<br>
<br>
<br>
<table align="center" border="2">
<tr>
<th>Patient ID
<th>Patient Name
<th>Visit Date
<%
while(rs.next())
{
out.println("<tr>");
out.println("<td>");
pid[no]=rs.getString(1);
out.println(pid[no]);
out.println("<td>");
out.println(rs.getString(2));
out.println("<td>");
java.sql.Date pdate=rs.getDate(10);
out.println(""+pdate.getDate()+"-"+pdate.getMonth()+"-"+pdate.getYear());
out.println("</tr>");
no++;
}
if(no==0)
{
out.println("you donot have any patient");
}
%>
</table>
<br>
<br>
<br>
<table align="center">
<tr><th>
Check Diagnostic Report:&nbsp;

<form action="./doctdiag.jsp" method="post">
<td><select name="pidd">
<%
for(int i=0;i<no;i++)
{
out.println("<option>"+pid[i]);
}
%>
</select></td>
&nbsp;&nbsp;
<td><input type="submit" value="submit">
</form>
</tr>
</table>

</body>
</html>
