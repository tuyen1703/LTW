package pxu.edu.vn.bai04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String taikhoan = request.getParameter("username");
        String matkhau = request.getParameter("password");
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kết quả đăng nhập tài khoản</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h1>Kết quả đăng nhập tài khoản</h1>");
        out.println("<p><strong>Tên tài khoản:</strong> " + taikhoan + "</p>");
        out.println("<p><strong>Mật khẩu:</strong> " + matkhau + "</p>");
        out.println("<p><strong>Đăng nhập thành công!</strong></p>"); // Thêm thông báo thành công
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
