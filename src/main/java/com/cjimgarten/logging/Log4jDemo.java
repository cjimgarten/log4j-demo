package com.cjimgarten.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by chris on 8/16/17.
 */
public class Log4jDemo {

    private static final Logger LOGGER = LogManager.getLogger(Log4jDemo.class);

    public void logLevels() {

        // log levels in order of severity
        LOGGER.trace("Trace");
        LOGGER.debug("Debug");
        LOGGER.info("Info");
        LOGGER.warn("Warn");
        LOGGER.error("Error");
        LOGGER.fatal("Fatal");
    }
}
