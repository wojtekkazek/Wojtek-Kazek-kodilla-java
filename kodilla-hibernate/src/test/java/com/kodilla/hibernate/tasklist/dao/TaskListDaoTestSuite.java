package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;
    private static final String LISTNAME = "Task 17.2";
    private static final String DESCRIPTION = "List of tasks made for module 17.2";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(LISTNAME,DESCRIPTION);

        //When
        taskListDao.save(taskList);

        //Then
        Assert.assertEquals(taskList.getListName(),"Task 17.2");

        //CleanUp
        taskListDao.deleteById(taskList.getId());

    }
}
