/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Hanin
 */
public class AccountService {
    
    String userName = "aba";
    String SecondUserName = "barb"; 
    String userpassword = "password";
    boolean active = false; 

    public AccountService() {
    }
    public AccountService(String userName,String userpassword ) {
        this.userName = userName; 
        this.userpassword = userpassword; 
    }

    public String getUserName() {
        return userName;
    }

    public String getUserpassword() {
        return userpassword;
    }

    public boolean isActive() {
        return active;
    }

    public String getSecondUserName() {
        return SecondUserName;
    }

    public void setSecondUserName(String SecondUserName) {
        this.SecondUserName = SecondUserName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setUserpassword(String Userpassword) {
        this.userpassword = Userpassword;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
    
  public AccountService login(String username, String password){
      if (username.equals(userName)|| username.equals(SecondUserName) & password.equals(userpassword)){
         AccountService user = new AccountService(username, password);
      return user; 
      }
      else
       
      return  null; 
  }  
}
