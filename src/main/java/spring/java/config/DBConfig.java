package spring.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import spring.java.domain.DataSource;

/**
 * Created by Jose on 3/6/2017.
 */
@Configuration
public class DBConfig {

    @Bean
    public DataSource dataSource() {
        DataSource dataSource = new DataSource();
        dataSource.setUrl("test url");
        dataSource.setUsername("test username");
        dataSource.setPassword("test password");
        return dataSource;
    }
}
