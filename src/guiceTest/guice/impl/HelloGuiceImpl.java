package guiceTest.guice.impl;

import guiceTest.guice.HelloGuice;

/**  
 * @author zhangj
 * HellGuice实现类  
 */  
public class HelloGuiceImpl implements HelloGuice {   
  
    /* (non-Javadoc)  
     * @see cn.jcourse.guice.HelloGuice#sayHello()  
     */  
    public void sayHello() {   
        System.out.println("Hello Guice!");   
    }   
}
