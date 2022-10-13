package com.javafortesters.example.chapter12;

import org.junit.Test;

import static org.testng.Assert.assertEquals;

public class testAdminUser {
    @Test
    public void anAdminUserHasElevatedPermissions(){
        AdminUser adminUser = new AdminUser("admin","Passw0rd");
        assertEquals("admin", adminUser.getUsername());
        assertEquals("Passw0rd", adminUser.getPassword());
        assertEquals("Elevated", adminUser.getPermission());
    }
}
