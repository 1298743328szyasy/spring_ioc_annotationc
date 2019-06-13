package cn.imnu.demo1;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 *
 */
//@Component("userService")
    @Service("userService")
public class UserService {
    @Value("米饭")
    private String something;

    public String sayHello(String name) {
        return "Hello" + name;
    }
    public void eat(){
        System.out.println("eat:"+something);
    }

}
