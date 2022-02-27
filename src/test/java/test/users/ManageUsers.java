package test.users;

import java.util.HashMap;
import java.util.Map;

public class ManageUsers {
    private static final Map<UserByTag,User> USERS=new HashMap();

    public enum UserByTag{
        ADMIN_USER_1,ADMIN_USER_2,PRIMARY_USER_1,PRIMARY_USER_2;
    }

    static {
        USERS.put(UserByTag.ADMIN_USER_1,new User("AdminUser_1","12345","Ama","Teena"));
        USERS.put(UserByTag.ADMIN_USER_2,new User("AdminUser_2","12345","Jay","Road"));
        USERS.put(UserByTag.PRIMARY_USER_1,new User("PrimaryUser_1","12345","Mega","Potter"));
        USERS.put(UserByTag.PRIMARY_USER_2,new User("PrimaryUser_2","12345","Ema","Black"));
    }

    public static User getUser(UserByTag userByTag){
        return USERS.get(userByTag);
    }
}
