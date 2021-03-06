package spring.java.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spring.java.domain.BlogPost;
import spring.java.service.BlogPostService;

/**
 * Created by Jose on 3/6/2017.
 */
public class WordpressBlogPostServiceImpl implements BlogPostService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BlogPostServiceImpl.class);

    @Override
    public void savePost(BlogPost blogPost) {

        LOGGER.debug("WordpressBlogPostServiceImpl: savePost is called");
    }
}
