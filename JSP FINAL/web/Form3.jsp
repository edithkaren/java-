 <%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="Colorlib Templates">
    <meta name="author" content="Colorlib">
    <meta name="keywords" content="Colorlib Templates">

    <!-- Title Page-->
    <title>IBM-Link7: SVIIT-SVICA Internship 20-21 Lock-1st Internal Evaluation report</title>

    <!-- Main CSS-->
    <link href="css/main.css" rel="stylesheet" media="all">
</head> 
<script>  
    function validateForm() {
  var x = document.forms["myForm"]["name"].value;
  if (x == "") {
    alert("Name must be filled out");
    return false;
  }
}
    </script> 
<body>
<div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <div class="card-heading">
                                <h2 class="title">IBM-Link7: SVIIT-SVICA Internship 20-21 Lock-1st Internal Evaluation report
                                   </h2>
                               
                            </div>
                </div>

                <div class="card-body">

                    <div class="form-row">

                        <div class="">
                  <li> 
                                    <p> The name and photo associated with your Google account will be recorded when you upload files and submit this form
                                    </p> 
                                </li>

                    </div>
                   
                </div>
            </div>
        </div><br> 
    <div class="page-wrapper bg-gra-03 p-t-45 p-b-50">
        <div class="wrapper wrapper--w790">
            <div class="card card-5">
                <div class="card-heading">
                    <h2 class="title"> Student Details</h2>
                </div>
                <div class="card-body">
                    
                    <!-- Form -->
                    <form method="POST" action="Form4.jsp" enctype="multipart/form-data" onsubmit="return validateForm()" required>
                        <div class="form-row m-b-55">
                            <div class="name">Name</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="name" name="name">
                                            <label class="label--desc">name</label>
                                        </div>
                                    </div>
                                </div> 
                                
                            </div>
                        </div> 
                          <div class="form-row m-b-55">
                            <div class="name">Surname</div>
                            <div class="value">
                                <div class="row row-space">
                                    <div class="col-2">
                                        <div class="input-group-desc">
                                            <input class="input--style-5" type="text" name="student_Surname">
                                            <label class="label--desc">Surname</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="form-row m-b-55">
                            <div class="name">Enrollment Number</div>
                            <div class="value">
                                <div class="input-group">
                                    <input class="input--style-5" type="text" name="enrollment_number"> 
                                    <label class="label--desc" >Enrollment Number </label>
                                </div>
                            </div>
                        </div>
                        
                       
                        <div class="form-row">
                            <div class="name">Specialization</div>
                            <div class="value">
                                <div class="input-group">
                                    <div class="rs-select2 js-select-simple select--no-search">
                                        <select name="specialization">
                                            <option disabled="disabled" selected="selected">Choose option</option>
                                            <option>BDA</option>
                                            <option>CMC</option>
                                        </select>
                                        <div class="select-dropdown"></div>
                                    </div>
                                </div>
                            </div>
                        </div>       
                        <div class="flex-parent jc-center">
                            <button class="btn btn--radius-2 btn--red"  type="button"  value="back" onclick="history.back()" >Back</button> 
                            <button class="btn btn--radius-2 btn--red" type="submit">Next</button>
                        </div> 
                    </form>
                    <!-- Form-Ending -->
                </div>
            </div>
        </div>
    </div>
</body>
</html>