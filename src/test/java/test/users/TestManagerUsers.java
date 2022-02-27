package test.users;

import org.testng.annotations.Test;

public class TestManagerUsers {
    @Test
    public void T1(){
        System.out.println("T1");
        User user1=ManageUsers.getUser(ManageUsers.UserByTag.ADMIN_USER_1);
        System.out.println(user1.getUserName()+" | "+user1.getPassword());

        User user2=ManageUsers.getUser(ManageUsers.UserByTag.ADMIN_USER_2);
        System.out.println(user2.getUserName()+" | "+user2.getPassword());
    }

    @Test
    public void T2(){
        System.out.println("T2");
        User user1=ManageUsers.getUser(ManageUsers.UserByTag.PRIMARY_USER_1);
        System.out.println(user1.getUserName()+" | "+user1.getPassword());

        User user2=ManageUsers.getUser(ManageUsers.UserByTag.PRIMARY_USER_2);
        System.out.println(user2.getUserName()+" | "+user2.getPassword());
    }
}
