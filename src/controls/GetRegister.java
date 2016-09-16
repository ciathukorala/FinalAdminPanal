package controls;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.connectionAdminPanal.connectionAdminPnl;
import com.google.gson.Gson;

import model.RegisterModel;
import model.commentsModel;


//@WebServlet("/GetMessages1")
public class GetRegister extends HttpServlet {
private static final long serialVersionUID = 1L;

public GetRegister() {
super();
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
response.setContentType("text/html;charset=UTF-8");
PrintWriter out = response.getWriter();
try
{
connectionAdminPnl database= new connectionAdminPnl();
RegisterModel projectManager= new RegisterModel();
ArrayList messagesData = null;
Connection connection = database.Get_Connection();
messagesData = projectManager.GetMessages(connection, request, response);
Gson gson = new Gson();
String messages = gson.toJson(messagesData);
out.println("{\"Messages\":"+messages+"}");
}
catch (Exception ex)
{
out.println("Error: " + ex.getMessage());
}
finally
{
out.close();
}
}
}
