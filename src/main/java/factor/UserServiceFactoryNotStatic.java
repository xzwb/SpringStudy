package factor;

import service.UserService;
import service.impl.UserServiceImpl;

public class UserServiceFactoryNotStatic {
    private  UserService userService = new UserServiceImpl();

    public UserService getUserService() {
        return userService;
    }
}
