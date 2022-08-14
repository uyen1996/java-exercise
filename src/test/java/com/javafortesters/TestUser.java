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
    @Test
    public void createUser(){
        for(int i = 1; i<= 100; i++){
            User user = new User();
            System.out.print(user.setUsername("user" + i));
            System.out.println(user.setPassword(" - password" + i ));
        }
//        String[] User = {"John", "Lisa", "Rosy"};
//        assertEquals("John", User[1]);
//        System.out.println("User : "
//                + User[0]);

    }

}
