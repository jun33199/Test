package guiceTest.guice;
import guiceTest.guice.impl.HelloGuiceImpl;

import com.google.inject.Binder;   
import com.google.inject.Module;   
/**  
 * @author zhangjun 
 * HelloGuice模块  
 */  
public class HelloGuiceModule implements Module {   
  
    /*  
     * (non-Javadoc)  
     *   
     * @see com.google.inject.Module#configure(com.google.inject.Binder)  
     */  
    public void configure(Binder binder) {   
        binder.bind(HelloGuice.class).to(HelloGuiceImpl.class);   
    }   
}  
