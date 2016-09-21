/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulathread;

import java.io.Serializable;

/**
 *
 * @author felipe
 */
public class Mensagens implements Serializable{
    private String message; 

    public String getUser() {
        return User;
    }

    public void setUser(String User) {
        this.User = User;
    }
    private String User;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
