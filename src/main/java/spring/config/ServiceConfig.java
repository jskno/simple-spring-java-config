package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java.service.EmailService;
import spring.java.service.ServiceManager;
import spring.java.service.impl.EmailServiceImpl;
import spring.java.service.impl.ServiceManagerImpl;

/**
 * Created by Jose on 3/6/2017.
 */
@Configuration
public class ServiceConfig {

    @Bean
    public EmailService emailService() {
        return new EmailServiceImpl();
    }

    @Bean
    public ServiceManager serviceManager() {
        return new ServiceManagerImpl();
    }
}
