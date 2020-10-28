package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user: users) {
            if (login.equals(user.getUsername())) {
                return (user);
            }
        }
        throw new UserNotFoundException("User is not found !!!");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid()) {
            throw new UserInvalidException("User is not valid !!!");
        }
        if (user.getUsername().length() < 3) {
            throw new UserInvalidException("Username must have more than 3 symbols");
        }
        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("evvvvvvvv", true),
                new User("e", true),
                new User("Semyon Racheev", false),
        };
        try {
            //User user = findUser(users, "Semyon");
            //User user = findUser(users, "Semyon Racheev");
            User user = findUser(users, "e");
            validate(user);
        } catch (UserInvalidException e) {
            e.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}