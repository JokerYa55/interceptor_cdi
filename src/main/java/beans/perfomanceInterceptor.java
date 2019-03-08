/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

/**
 *
 * @author vasil
 */
@perfomanceMonitor
@Interceptor
public class perfomanceInterceptor {

    @AroundInvoke
    public Object monitor(InvocationContext ctx) throws Exception {
        long start = new Date().getTime();
        Logger.getLogger(getClass().getName()).log(Level.INFO, "{0}", new Object[]{ctx.getMethod().getName()});
        try {
            return ctx.proceed();
        } finally {
            long elapsed = new Date().getTime() - start;
            Logger.getLogger(getClass().getName()).log(Level.INFO, "Elapsed time {0}    : {1}", new Object[]{ctx.getMethod().getName(), elapsed});
        }
    }
}
