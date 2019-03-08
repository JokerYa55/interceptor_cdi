/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

/**
 *
 * @author vasil
 */
@Named
@ApplicationScoped
@perfomanceMonitor
public class testInterceptor {
    public void test1(){
        System.out.println("test_1");
    }
    
    public void test2(){
        System.out.println("test_2");
    }
}
