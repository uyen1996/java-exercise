package baiTap.practice.algorithm;
import com.javafortesters.User;
import org.testng.annotations.Test;

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

    @Test
    public void triangle(){
        int rows = 10;

        for (int i = 1; i <= rows; i++)
        {
            int number = i;

            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
                number += (rows - j);
            }
            System.out.println();
        }
    }

}
