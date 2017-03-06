package spring.java.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.java.domain.DataSource;

/**
 * Created by Jose on 3/6/2017.
 */
public class XmlMainApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(XmlMainApplication.class);

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("application-context.xml");

        DataSource dataSource2 = context.getBean(DataSource.class);
        LOGGER.debug(dataSource2.getUrl());
        LOGGER.debug(dataSource2.getUsername());
    }
}
