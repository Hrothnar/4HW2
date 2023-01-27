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
        User user = new User();
        Assertions.assertNotNull(user);
    }

    @Test
    public void correctEmail() {
        Assertions.assertTrue(user.getEmail().contains("@") && user.getEmail().contains("."));
    }

    @Test
    public void isLoginAndEmailEqual() {
        assertNotEquals(user.getLogin(), user.getEmail());
    }


}