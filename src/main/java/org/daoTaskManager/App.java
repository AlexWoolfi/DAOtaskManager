package org.daoTaskManager;
import org.apache.log4j.Logger;
import org.daoTaskManager.utils.ClassNameUtil;
import org.daoTaskManager.utils.ComandExecuter;
import java.io.IOException;

import static org.daoTaskManager.utils.ClassNameUtil.getCurrentClassName;

public class App
{
    private static final Logger userLogger = Logger.getLogger(getCurrentClassName());

    public static void main( String[] args ) throws IOException {
        userLogger.info("Main is starred");
        userLogger.info("+");
        ComandExecuter.filtrFromArgs(args);
    }
}
