package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import dto.commentsGetSet;
public class daoComments 
{


public ArrayList GetMessages(Connection connection,HttpServletRequest request,HttpServletResponse response) throws Exception
{
ArrayList messageData = new ArrayList();
try
{
PreparedStatement ps = connection.prepareStatement("SELECT * FROM contact");
ResultSet rs = ps.executeQuery();
while(rs.next())
{
commentsGetSet messageObject = new commentsGetSet();
messageObject.setName(rs.getString("Name"));
messageObject.setEmail(rs.getString("Email"));
messageObject.setMessage(rs.getString("Message"));
messageObject.setSubject(rs.getString("Subject"));
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