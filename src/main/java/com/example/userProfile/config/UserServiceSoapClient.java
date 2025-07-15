package com.example.userProfile.config;

import com.example.userProfile.soap.userService.UserSoapService;
import com.example.userProfile.soap.userService.UserSoapService_Service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserServiceSoapClient {

    @Bean
    public UserSoapService createUserServiceSoapClient() {
        UserSoapService_Service service = new UserSoapService_Service();
        return service.getUserSoapServicePort();
    }
}
