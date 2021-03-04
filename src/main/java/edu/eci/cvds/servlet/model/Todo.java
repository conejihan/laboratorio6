package edu.eci.cvds.servlet.model;

public class Todo {
    private String userId,id,title,completed;
    
    public Todo(){

    }

	public void setUserId(String userId){
        this.userId = userId ;             
    }
    public void setId(String id){
        this.id = id ;             
    }
    public void setTitle(String title){
        this.title = title ;             
    }
    public void setCompleted(String completed){
        this.completed = completed ;             
    }


    public String getUserId(){
        return this.userId;             
    }
    public String getId(){
        return this.id;             
    }
    public String getTitle(){
        return this.title;             
    }
    public String getCompleted(){
        return this.completed;             
    }
    
    
}