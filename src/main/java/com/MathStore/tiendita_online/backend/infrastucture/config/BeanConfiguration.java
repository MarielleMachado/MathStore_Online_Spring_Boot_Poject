package com.MathStore.tiendita_online.backend.infrastucture.config;

import com.MathStore.tiendita_online.backend.application.UserService;
import com.MathStore.tiendita_online.backend.domain.port.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public UserService userService(IUserRepository iUserRepository){
        return new UserService(iUserRepository);
    }

}
