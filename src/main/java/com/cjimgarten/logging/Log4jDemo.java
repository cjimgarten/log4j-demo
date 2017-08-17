package com.cjimgarten.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by chris on 8/16/17.
 */
public class Log4jDemo {

    private static final Logger logger = LogManager.getLogger(Log4jDemo.class);

    public void logLevels() {

        // log levels in order of severity
        logger.trace("Trace");
        logger.debug("Debug");
        logger.info("Info");
        logger.warn("Warn");
        logger.error("Error");
        logger.fatal("Fatal");
    }
}