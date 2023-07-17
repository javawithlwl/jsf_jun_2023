package com.careerit.jsf.cj.basics.day22;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
class User {
    private String username;
    private String password;
    private String mobile;
}

class AuthServiceUtil {

    private List<User> appUsers;
    private Map<String,User> userMap;

    public AuthServiceUtil() {
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            appUsers = objectMapper.readValue(AuthServiceUtil.class.getResourceAsStream("/users.json"), new TypeReference<List<User>>() {
            });
            userMap = appUsers.stream().collect(Collectors.toMap(User::getUsername, Function.identity()));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public User login(String username, String password) {
        if(userMap.containsKey(username)) {
            User user = userMap.get(username);
            if(user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new IllegalArgumentException("Invalid username or password");
    }

}

public class LoginServiceExample {

    public static void main(String[] args) {

        AuthServiceUtil authServiceUtil = new AuthServiceUtil();
        User user = authServiceUtil.login("admin", "admin@lwl.com");
        System.out.println(user);
    }
}
