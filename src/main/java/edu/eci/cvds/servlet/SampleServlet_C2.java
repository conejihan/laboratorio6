package edu.eci.cvds.servlet;

import edu.eci.cvds.servlet.model.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.io.Writer;
import java.util.Optional;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@WebServlet(
    urlPatterns = "/lab5"
)
public class SampleServlet_C2 extends HttpServlet{
    static final long serialVersionUID = 35L;
    List<Todo> todolist = new ArrayList<>();

    @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try{
      Writer responseWriter = resp.getWriter();
      Optional<String> optName = Optional.ofNullable(req.getParameter("id"));
      String id = optName.isPresent() && !optName.get().isEmpty() ? optName.get() : "";
      int ID = Integer.parseInt(id);
      Todo todo = Service.getTodo(ID);
      if (todo!=null){
        todolist.add(todo);
        responseWriter.write(Service.todosToHTMLTable(todolist));
        responseWriter.flush();
        resp.setStatus(HttpServletResponse.SC_OK);
      }else{
        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
        
      }
    }catch (MalformedURLException e){
      resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }catch (NumberFormatException | IOException e){
      resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }
  }

  /*@Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try{
      Writer responseWriter = resp.getWriter();
      Optional<String> optId = Optional.ofNullable(req.getParameter("ID"));
      String ID2 = optId.isPresent() && !optId.get().isEmpty() ? optId.get() : "";
      int ID = Integer.parseInt(ID2);
      Todo todo = Service.getTodo(ID);
      if (todo!=null){
        todolist.add(todo);
        responseWriter.write(Service.todosToHTMLTable(todolist));
        responseWriter.flush();
        resp.setStatus(HttpServletResponse.SC_OK);
      }else{
        resp.setStatus(HttpServletResponse.SC_NOT_FOUND);
      }
    }catch (MalformedURLException e){
      resp.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
    }catch (NumberFormatException | IOException e){
      resp.setStatus(HttpServletResponse.SC_BAD_REQUEST);
    }
  }*/
}