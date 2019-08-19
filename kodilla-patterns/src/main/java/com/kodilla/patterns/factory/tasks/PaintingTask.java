package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    private String taskName;
    private String color;
    private boolean taskExecuted;
    private String whatToPaint;

    public PaintingTask(String color, String whatToPaint) {
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        if(color == "Red") {
            //do sth
        } else {
            //do sth else
        }
        taskExecuted = true;
    }

    @Override
    public String getTaskName() {
        return "painting";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
