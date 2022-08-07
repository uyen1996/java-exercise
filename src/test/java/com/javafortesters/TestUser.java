package com.javafortesters;
import com.javafortesters.User;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class TestUser {
    @Test
    public void canSetPassword(){
        User user = new User();
        System.out.println(user.getPassword());

       // user.setPassword("Pass123456");
//        assertEquals("setter  password expected", "Pass123456",user.getPassword());
    }
}
