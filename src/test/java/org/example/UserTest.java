package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    private final User user = new User("login", "login@mail.ru");

    @Test
    public void correctCreation() {
        Assertions.assertNotNull(user.getLogin());
        Assertions.assertNotNull(user.getEmail());
    }

    @Test
    public void notNull() {
        User emptyUser = new User();
        Assertions.assertNotNull(emptyUser);
        Assertions.assertNull(emptyUser.getLogin());
        Assertions.assertNull(emptyUser.getEmail());
    }

    @Test
    public void correctEmailFirst() {
        Assertions.assertTrue(user.getEmail().contains("@"), "Email должен содержать \"@\"");
    }

    @Test
    public void correctEmailSecond() {
        Assertions.assertTrue(user.getEmail().contains("."), "Email должен содержать \".\"");
    }

    @Test
    public void isLoginAndEmailEqual() {
        assertNotEquals(user.getLogin(), user.getEmail());
    }


}