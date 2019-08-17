package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private TaskClass taskClass;
    private String taskName;
    private String where;
    private String using;

    public DrivingTask(TaskClass taskClass, String where, String using) {
        this.taskClass = taskClass;
        this.taskName = taskClass.getTaskName();
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        if (using == "Car") {
            return true;
        }
        return false;
    }
}
