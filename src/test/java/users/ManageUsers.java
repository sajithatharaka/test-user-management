package users;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ManageUsers {
    private static final Map<UserIdentifier,User> USERS=new HashMap<>();

    public enum UserIdentifier{
        ADMIN_USER_1,ADMIN_USER_2,PRIMARY_USER_1,PRIMARY_USER_2,PRIMARY_USER_3;
    }

    static {
            USERS.put(UserIdentifier.ADMIN_USER_1,new User("ADMIN_USER_1","12345","Ama","Teen"));
            USERS.put(UserIdentifier.ADMIN_USER_2,new User("ADMIN_USER_2","12345","Jay","Road"));
            USERS.put(UserIdentifier.PRIMARY_USER_1,new User("PRIMARY_USER_1","12345","Peter","Brown"));
            USERS.put(UserIdentifier.PRIMARY_USER_2,new User("PRIMARY_USER_2","12345","Mega","Potter"));
            USERS.put(UserIdentifier.PRIMARY_USER_3,new User("PRIMARY_USER_3","12345","Ema","Black"));
    }

    public static User getUser(UserIdentifier userIdentifier){
        return USERS.get(userIdentifier);
    }
}
