package com.kodilla.spring.portfolio;

import com.kodilla.spring.reader.ReaderConfig;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class BoardTestSuite {

    @Test
    public void BoardTestSuite() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(ReaderConfig.class);
        //When
        Board board = context.getBean(Board.class);
        List<String> list1 = board.getToDoList().getTasks();
        list1.add("task1");
        List<String> list2 = board.getInProgressList().getTasks();
        list2.add("task2");
        List<String> list3 = board.getDoneList().getTasks();
        list3.add("task3");
        //Then
        Assert.assertEquals("task1",list1.toArray()[0]);
        Assert.assertEquals("task2",list2.toArray()[0]);
        Assert.assertEquals("task3",list3.toArray()[0]);
    }

}
