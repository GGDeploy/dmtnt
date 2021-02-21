package pl.ggdeploy.users;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserFacade {

    private UserService userService;

    public UserFacade(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String username, String displayName, String password, String avatar) {
        User user = User.builder()
                .username(username)
                .displayName(displayName)
                .password(password)
                .avatar(avatar)
                .friends(List.of())
                .build();
        userService.createUser(user);
    }
}
