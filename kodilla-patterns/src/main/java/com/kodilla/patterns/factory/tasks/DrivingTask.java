package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private boolean taskExecuted;
    private String using;

    public DrivingTask(String where, String using) {
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        if (using.equals("Car")) {
            //so sth
        } else {
            //do sth else
        }
        taskExecuted = true;

    }

    @Override
    public String getTaskName() {
        return "driving";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
