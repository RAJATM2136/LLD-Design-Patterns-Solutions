package User;

public class UserController {
    UserService userService;
    public UserController() {
        this.userService = new UserService();
    }
    public UserDO addUser(UserDO user) {
        return userService.addUser(user);
    }

    public UserDO getUser(int id) {
        return userService.getUser(id);
    }
}
