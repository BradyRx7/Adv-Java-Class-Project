/*
 * @author Brady Reed
 * Umass Lowell INFO2970 & INFO3030
 */
package edu.bradyreed.advancedjava.exception;

public class BadArrayException extends Exception {
    
    public BadArrayException() {
        super("Generic Bad Array Exception");
    }
    
    public BadArrayException(String errorMsg) {
        super(errorMsg);
    }
}
    
    
