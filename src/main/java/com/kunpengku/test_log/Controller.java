package com.kunpengku.test_log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 * <p>
 * </p>
 * DATE 17/12/5.
 *
 * @author fupeng.
 */
@RestController
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @RequestMapping("/")
    public void test(){
        System.out.println("123");

        logger.error("error");
        logger.warn("warn");
        logger.info("info");
        logger.debug("debug");

    }

}
