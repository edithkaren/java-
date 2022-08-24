<%-- 
    Document   : Result
    Created on : May 22, 2021, 2:56:45 PM
    Author     : HP001
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
          <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">
        <title>JSP Page</title> 
        <link href="css/main.css"  rel="stylesheet" media="all"> 
    <style>
        .main {
            width: 100vw;
            height: 90vh;
            border: 5px double black;
            padding-top: 10px;

        }

        .header {
            width: 100%;
            height: 25%;
            display: flex;
            flex-direction: column;

            justify-content: space-evenly;
            align-items: center;
        }

        .linkName {
            margin-top: 20px;
            font-size: large;
        }

        .logo {
            width: 100%;
            text-align: center;
            font-size: 80px;
            ;
            font-family: 'Gill Sans', 'Gill Sans MT', Calibri, 'Trebuchet MS', sans-serif;
        }

        .myTable {
            width: 100%;
            height: 70%;
            
        }
        .table{
            font-size: large;
        }
    </style>

    </head>
    <body>
    <div id="jspBody"  class="main">    
    <div class="linkname"> 
        IBM-Link7: SVIIT-SVICA Internship20-21 Lock-1st Internal Evaluation Report
    </div>
    </div> 
        <div class="myTable" > 
            <table border="1" class="table"> 
                <tbody> 
                    <tr> 
                        <td> # </th> 
                        <td> key </th> 
                        <td> Value</th> 
                    </tr> 
                     <tr>
                        <th>1</th>
                        <td>Name</td>
                        <td>${student_name}</td>
                    </tr>
                    <tr>
                        <th>2</th>
                        <td>Surname</td>
                        <td>${student_surname}</td>
                    </tr>
                    <tr>
                        <th>3</th>
                        <td>Enrollment_Number </td>
                        <td> ${enrollment_number}</td>
                    </tr>
                    <tr>
                        <th>4</th>
                        <td>Specialization </td>
                        <td> ${specialization}</td>
                    </tr>
                    <tr>
                        <th>5</th>
                        <td>Mentor Number</td>
                        <td> ${mentor_phone}</td>
                    </tr>
                    <tr>
                        <th>6</th>
                        <td>File_path_name</td>
                        <td> ${file_path_name}</td>
                    </tr> 
                    <tr>
                        <th>7</th>
                        <td>Percentage</td>
                        <td> ${percentage}</td>
                    </tr> 
                    <tr>
                        <th>8</th>
                        <td>Grade</td>
                        <td> ${grade}</td>
                    </tr>
                    <tr>
                        <th>9</th>
                        <td>Marks</td>
                        <td> ${score}</td>
                    </tr>
                </tbody>
            </table>
        </div> 

                    <div> 
                        <button class="btn btn--blue" type="button" id="generateMypdf" > download </button>
                    </div> 
    </body>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jspdf/1.1.135/jspdf.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
<script src="meraScript.js"></script>
       
</html>
