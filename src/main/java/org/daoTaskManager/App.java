package org.daoTaskManager;


import org.daoTaskManager.utils.ComandExecuter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

public class App 
{
    private static final Logger rootLogger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) throws IOException {
        rootLogger.info("Main is starred");
        rootLogger.info("+");

        ComandExecuter.filtrFromArgs(args);
    }
}
