package org.howard.edu.lsp.assignment4.implementation;

/**
 * 
 * This class implements the EmptyException exception
 * 
 * @author Deante Taylor
 *
 */
public class EmptySetException extends Exception {
    public EmptySetException(String errors) {
        super(errors);
    }
}