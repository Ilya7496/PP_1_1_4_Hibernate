package jm.task.core.jdbc;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;
import java.util.ArrayList;
import java.util.List;

public class  Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ilya", "Mikhailov", (byte) 28);
        userService.saveUser("Alexander", "Gaponenko", (byte) 27);
        userService.saveUser("Danil","Shalahinov", (byte) 27);
        userService.saveUser("Leonid","Zakharov", (byte) 28);
        List<User> users = userService.getAllUsers();
        System.out.println(users);
        userService.cleanUsersTable();
        userService.dropUsersTable(); // реализуйте алгоритм здесь
    }
}
