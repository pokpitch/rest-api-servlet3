package game.door.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.map.ObjectMapper;

import game.door.bean.Message;

@WebServlet("/hello")
public class Hello extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Message helloMessage = new Message();
		
		helloMessage.setId(1);
		helloMessage.setName("Pokpitch");
		helloMessage.setDescription("First Servlet");
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(resp.getOutputStream(), helloMessage);
		
	}

}
