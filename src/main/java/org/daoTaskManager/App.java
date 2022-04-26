package org.daoTaskManager;
import org.daoTaskManager.utils.ClassNameUtil;
import org.daoTaskManager.utils.ComandExecuter;
import java.io.IOException;

public class App 
{
//    private static final Logger rootLogger = LoggerFactory.getLogger(App.class);

    public static void main( String[] args ) throws IOException {
//        rootLogger.info("Main is starred");
//        rootLogger.info("+");
        ComandExecuter.filtrFromArgs(args);
    }
}
