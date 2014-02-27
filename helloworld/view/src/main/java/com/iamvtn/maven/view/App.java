package com.iamvtn.maven.view;

import com.iamvtn.maven.controller.logic.HelloLogic;
import com.iamvtn.maven.controller.logic.impl.HelloLogicImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	HelloLogic helloLogic = new HelloLogicImpl();
    	String sayHello = helloLogic.sayHello();
        System.out.println( sayHello );
    }
}
