package spring.java.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import spring.config.ServiceConfig;
import spring.java.service.BlogPostService;
import spring.java.service.impl.BlogPostServiceImpl;
import spring.java.service.impl.MediumBlogPostServiceImpl;
import spring.java.service.impl.WordpressBlogPostServiceImpl;

/**
 * Created by Jose on 3/6/2017.
 */
@ComponentScan(basePackages = {"spring.java"})
@Import(value={ServiceConfig.class})
public class JavaConfig {

    @Autowired
    private ServiceConfig serviceConfig;

    @Bean  // default bean id is method name
    public BlogPostService blogPostService() {
        return new BlogPostServiceImpl();
    }

    @Bean(name="WordpressBlogPostService")
    public BlogPostService wordpressBlogPostService() {
        return new WordpressBlogPostServiceImpl();
    }

    @Bean(name="MediumBlogPostService")
    public BlogPostService mediumBlogPostService() {
        return new MediumBlogPostServiceImpl();
    }
}
