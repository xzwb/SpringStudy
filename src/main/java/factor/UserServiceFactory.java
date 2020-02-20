package factor;

import service.UserService;
import service.impl.UserServiceImpl;

public class UserServiceFactory {
    private static UserService userService = new UserServiceImpl();

    public static UserService getUserService() {
        return userService;
    }
}
