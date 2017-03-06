package spring.java.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.java.domain.BlogPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;
import spring.java.service.EmailService;
import spring.java.service.ServiceManager;

/**
 * Created by Jose on 3/6/2017.
 */
public class MainApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(MainApplication.class);

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                JavaConfig.class);

//        BlogPostService blogPostService = context.getBean(BlogPostService.class);
        BlogPostService blogPostService = (BlogPostService) context.getBean("blogPostService");
//        BlogPostService blogPostService = (BlogPostService) context.getBean("WordpressBlogPostService");

        BlogPost blogPost = new BlogPost();
        blogPost.setId(1L);
        blogPost.setBlogTitle("Java Spring MVC Annotations Java Config");
        blogPostService.savePost(blogPost);

        DataSource dataSource = context.getBean(DataSource.class);
        LOGGER.debug("DataSource: " + dataSource.getUrl());
        LOGGER.debug("DataSource: " + dataSource.getUsername());
        LOGGER.debug("DataSource: " + dataSource.getPassword());

        EmailService emailService = context.getBean(EmailService.class);
        emailService.sendEmail();

        ServiceManager serviceManager = context.getBean(ServiceManager.class);
        serviceManager.sendBlogPost(blogPost);

        ((ConfigurableApplicationContext) context).close();

    }
}
