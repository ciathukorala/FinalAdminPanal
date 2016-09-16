package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dto.RegisterGetSet;
import dto.commentsGetSet;

public class daoRegister {

	public ArrayList GetMessages(Connection connection,HttpServletRequest request,HttpServletResponse response) throws Exception
	{
	ArrayList messageData = new ArrayList();
	try
	{
	PreparedStatement ps = connection.prepareStatement("SELECT * FROM register");
	ResultSet rs = ps.executeQuery();
	while(rs.next())
	{
	RegisterGetSet messageObject = new RegisterGetSet();
	messageObject.setReg_Id(rs.getString("Reg_Id"));
	messageObject.setFirstName(rs.getString("FirstName"));
	messageObject.setLastName(rs.getString("lastName"));
	messageObject.setEmail(rs.getString("email"));
	messageObject.setPassWord(rs.getString("passWord"));
	messageObject.setPhoneNumber(rs.getString("phoneNumber"));
	messageObject.setAdditionDetails(rs.getString("additionDetails"));
	messageObject.setRole(rs.getString("role"));
	
	messageData.add(messageObject);
	}
	return messageData;
	}
	catch(Exception e)
	{
	throw e;
	}
	}
}
