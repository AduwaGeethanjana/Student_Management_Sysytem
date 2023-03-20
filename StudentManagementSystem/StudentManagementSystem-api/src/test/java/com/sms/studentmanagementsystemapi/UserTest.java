package com.sms.studentmanagementsystemapi;




import com.sms.studentmanagementsystemapi.model.User;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void testGetName() {
        User user = new User();
        user.setName("Sara");
        assertEquals("Sara", user.getName());
    }

    public void testGetEmail(){
        User user =new User();
        user.setEmail("sarageethanjana@gmail.com");
        assertEquals("sarageethanjana2gmail.com",user.getEmail());
    }

    public void testUserName(){
        User user=new User();
        user.setUsernames("Aduwa");
        assertEquals("Aduwa",user.getUsernames());
    }

    public void testDegreeProgram(){
        User user=new User();
        user.setDegreeProgram("Computer Engineering");
        assertEquals("Computer engeneering",user.getDegreeProgram());
    }




}
