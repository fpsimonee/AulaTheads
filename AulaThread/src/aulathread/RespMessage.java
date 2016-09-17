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
public class RespMessage implements Serializable{
    private String respMessage; 

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }  
    
    
}
