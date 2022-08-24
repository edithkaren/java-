

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

	@WebServlet("sql")
		@MultipartConfig(fileSizeThreshold=1024*1024*2, // 2MB
	    maxFileSize=1024*1024*10,      // 10MB
	    maxRequestSize=1024*1024*50)   // 50MB
public class Servlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIR = "uploadFiles";

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
	{
		//JDBC connection credentials
		String url = "jdbc:mysql://localhost:3306/form1";
		String username = "gladwin";
		String password = "#Gladwin1234";
		
		HttpSession session = request.getSession();
		//Form Data
		String email = (String)session.getAttribute("email");
		String student_name = request.getParameter("Student_name");
		session.setAttribute("student_name", student_name);
		String student_surname = request.getParameter("surname");
		session.setAttribute("student_surname", student_surname);
		String enrollment_number = request.getParameter("enrollment_number");
		session.setAttribute("enrollment_number", enrollment_number);
		
		String specialization = request.getParameter("specialization");
		session.setAttribute("specialization", specialization);
		String mentor_phone = request.getParameter("mentor_phone");
		session.setAttribute("mentor_phone", mentor_phone);
		int score = Integer.parseInt(request.getParameter("score"));
		session.setAttribute("score", score); 
                int percentage=Integer.parseInt(request.getParameter("Percentage")); 
                session.setAttribute("percentage",percentage); 
                String grade=request.getParameter("grade"); 
                session.setAttribute("grade", grade); 
		String file_path_name = fileParser(request);
		session.setAttribute("file_path_name", file_path_name);
		//Loading the JDBC driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		//Establishing the connection with the Mysql server.
		try {
			Connection con = DriverManager.getConnection(url, username, password);	
			PreparedStatement query = con.prepareStatement("INSERT INTO phase1_link6 (email, student_name, student_surname, enrollment_number, specialization, mentor_phone,file_path_name,percentage,grade ,score) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?,?);");
			query.setString(1,email);
			query.setString(2,student_name);
			query.setString(3,student_surname);
			query.setString(4,enrollment_number);
			query.setString(5,specialization);
			query.setString(6,mentor_phone);
			query.setString(7,file_path_name);
			query.setString(8,percentage+""); 
                        query.setString(9,score+"");
			query.setString(10,file_path_name);
			@SuppressWarnings("unused")
			int temp  = query.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
			
		}
		
//		out.println("Your response has been recorded successfully.");
		RequestDispatcher rd4 =  request.getRequestDispatcher("result.html");
		rd4.forward(request, response);
//		session.invalidate();
	}
	protected String fileParser(HttpServletRequest rq) throws IOException, ServletException
	{
		 // gets absolute path of the web application
        String appPath = rq.getServletContext().getRealPath("");
        // constructs path of the directory to save uploaded file
        String savePath = appPath + File.separator + SAVE_DIR;
         
        // creates the save directory if it does not exists
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
         
        for (Part part : rq.getParts()) {
            String fileName = extractFileName(part);
            // refines the fileName in case it is an absolute path
            fileName = new File(fileName).getName();
            part.write(savePath + File.separator + fileName);
        }
        System.out.println("Save Path ======================="+ savePath);
        return  savePath;
	}
	
	private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }
	
	
	
	
}
