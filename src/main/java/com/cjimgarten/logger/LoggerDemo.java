package com.cjimgarten.logger;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by chris on 8/16/17.
 */
public class LoggerDemo {

    private static final Logger logger = LogManager.getLogger(LoggerDemo.class);

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
