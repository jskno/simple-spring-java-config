package spring.java.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import spring.java.domain.BlogPost;
import spring.java.domain.DataSource;
import spring.java.service.BlogPostService;
import spring.java.service.EmailService;

/**
 * Created by Jose on 3/6/2017.
 */
public class BlogPostServiceImpl implements BlogPostService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPostServiceImpl.class);

    @Autowired
    DataSource dataSource;

    @Autowired
    EmailService emailService;

    @Override
    public void savePost(BlogPost blogPost) {

        LOGGER.debug("BlogPostServiceImpl: " + dataSource.getUrl());
        LOGGER.debug("BlogPostServiceImpl: savePost is called");
        emailService.sendEmail();
    }
}
