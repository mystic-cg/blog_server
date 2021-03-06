package org.mystic.blog;

import org.mybatis.spring.annotation.MapperScan;
import org.mystic.blog.utils.ApplicationContextUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Created with IntelliJ IDEA.
 *
 * @author: mystic
 * @date: 2017/10/12 10:39
 * @since: JDK1.8.0_144
 * @version: X
 * Description:
 */
@SpringBootApplication
@EnableTransactionManagement
@EnableCaching
@MapperScan("org.mystic.blog.dao")
public class BlogApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BlogApplication.class, args);
        ApplicationContextUtil.setApplicationContext(context);
    }

}
