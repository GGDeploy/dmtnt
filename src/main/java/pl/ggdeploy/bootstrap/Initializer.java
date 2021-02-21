package pl.ggdeploy.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import pl.ggdeploy.users.UserFacade;

@Component
public class Initializer implements ApplicationListener<ContextRefreshedEvent> {

    private UserFacade userFacade;

    Initializer(UserFacade userFacade) {
        this.userFacade = userFacade;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        userFacade.createUser("username", "angelus", "password", "avatar");
    }
}
