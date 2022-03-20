package org.daoTaskManager;

import org.daoTaskManager.utils.ComandExecuter;

import java.io.IOException;

public class App 
{
    public static void main( String[] args ) throws IOException {
        ComandExecuter.filtrFromArgs(args);
    }
}
