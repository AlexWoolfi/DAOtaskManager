package org.blmodule.abstractFactory.jdbcDao;



import org.blmodule.abstractFactory.intrfacesForFactories.TaskDao;
import org.blmodule.entity.Task;

import java.util.List;

public class JdbcTaskDaoImpl implements TaskDao {
    @Override
    public void addTaskToDB(String taskName, String taskBody, long id) {

    }

    @Override
    public List<Task> showTasksfromUnicUser(String USerunicName) {
        return null;
    }
}
