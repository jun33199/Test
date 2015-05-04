package guiceTest.guice.test;

import guiceTest.guice.HelloGuice;
import guiceTest.guice.HelloGuiceModule;
  

import com.google.inject.Guice;   
import com.google.inject.Injector;   
  

import junit.framework.TestCase;   
  
/**  
 * @author zhangtao   
 * 测试Guice  
 */  
public class TestGuice extends TestCase {   
    public void testHelloGuice() {   
        Injector injector = Guice.createInjector(new HelloGuiceModule());   
        HelloGuice helloGuice = injector.getInstance(HelloGuice.class);   
        helloGuice.sayHello();   
    }   
} 
