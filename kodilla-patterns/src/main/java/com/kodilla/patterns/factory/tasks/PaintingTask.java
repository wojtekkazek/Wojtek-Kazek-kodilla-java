package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private TaskClass taskClass;
    private String taskName;
    private String color;
    private String whatToPaint;

    public PaintingTask(TaskClass taskClass, String color, String whatToPaint) {
        this.taskClass = taskClass;
        this.taskName = taskClass.getTaskName();
        this.color = color;
        this.whatToPaint = whatToPaint;
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
        if(color == "Red") {
            return false;
        }
        return true;
    }
}
