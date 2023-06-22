package pxu.edu.vn.bai03;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThongTin
 */
@WebServlet("/ThongTin")
public class ThongTin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThongTin() {
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
        
        String ho = request.getParameter("ho");
        String ten = request.getParameter("ten");
        String ngaysinh = request.getParameter("ngaysinh");
        String gioitinh = request.getParameter("gioitinh");
        String email = request.getParameter("email");
        String taikhoan = request.getParameter("username");
        String matkhau = request.getParameter("password");
        
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Kết quả đăng ký tài khoản</title>");
        out.println("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM\" crossorigin=\"anonymous\">");
        out.println("</head>");
        out.println("<body>");
        out.println("<div class=\"container\">");
        out.println("<h1>Kết quả đăng ký tài khoản</h1>");
        out.println("<p><strong>Họ:</strong> " + ho + "</p>");
        out.println("<p><strong>Tên:</strong> " + ten + "</p>");
        out.println("<p><strong>Ngày sinh:</strong> " + ngaysinh + "</p>");
        out.println("<p><strong>Giới tính:</strong> " + gioitinh + "</p>");
        out.println("<p><strong>Địa chỉ email:</strong> " + email + "</p>");
        out.println("<p><strong>Tên tài khoản:</strong> " + taikhoan + "</p>");
        out.println("<p><strong>Mật khẩu:</strong> " + matkhau + "</p>");
        out.println("<p><strong>Đăng ký tài khoản thành công!</strong></p>"); // Thêm thông báo thành công
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
