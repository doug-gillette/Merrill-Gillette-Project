/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Jake
 */
public class ResourcesControlException extends Exception{
    public ResourcesControlException() {
        
    }
    public ResourcesControlException(String message) {
        super(message);
    }
    public ResourcesControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ResourcesControlException(Throwable cause) {
        super(cause);
    }

    public ResourcesControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
