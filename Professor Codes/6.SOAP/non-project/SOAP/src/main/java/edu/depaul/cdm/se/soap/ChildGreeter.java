package edu.depaul.cdm.se.soap;

import javax.jws.WebService;

/**
 * Example to illustrate inheritance at work
 * Question
 * <li>What happens when @WebService is removed from the Greeter class?
 * <li>What happens when another method is added on Greeter class and the wsdlLocation is specified
 * for this class?
 * <li>SOAPBinding options and compare different wsdl generated by each operation
 */
@WebService
public class ChildGreeter extends Greeter {
    public String sayItAgain(String name) {
        return hello(name) + ", again";
    }
} 
