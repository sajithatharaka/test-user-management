package test;

import listeners.TestListener;
import org.testng.annotations.Test;
import users.ManageUsers;
import users.User;
import static users.ManageUsers.UserIdentifier;

public class ManageUser {

    @Test
    public void T1() throws Exception {
        System.out.println("T1 Started");
        User user1 = ManageUsers.getUser(UserIdentifier.ADMIN_USER_1);
        System.out.println(user1.getUsername()+"|"+user1.getPassword());

        User user2 = ManageUsers.getUser(UserIdentifier.ADMIN_USER_2);
        System.out.println(user2.getUsername()+"|"+user2.getPassword());

        User user3 = ManageUsers.getUser(UserIdentifier.PRIMARY_USER_1);
        System.out.println(user3.getUsername()+"|"+user3.getPassword());
        System.out.println("T1 Finished");

    }

    @Test
    public void T2() throws Exception {
        System.out.println("T2 Started");
        User user1 = ManageUsers.getUser(UserIdentifier.ADMIN_USER_1);
        System.out.println(user1.getUsername()+"|"+user1.getPassword());
        System.out.println("T2 Finished");
    }

    @Test
    public void T3() throws Exception {
        System.out.println("T3 Started");
        User user1 = ManageUsers.getUser(UserIdentifier.PRIMARY_USER_2);
        System.out.println(user1.getUsername()+"|"+user1.getPassword());
        System.out.println("T3 Finished");
    }

    @Test
    public void T4() throws Exception {
        System.out.println("T4 Started");
        User user1 = ManageUsers.getUser(UserIdentifier.PRIMARY_USER_3);
        System.out.println(user1.getUsername()+"|"+user1.getPassword());
        System.out.println("T4Finished");
    }
}
