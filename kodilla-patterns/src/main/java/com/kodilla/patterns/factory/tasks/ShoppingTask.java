package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private String taskName;
    private String whatToBuy;
    private boolean taskExecuted;
    private double quantity;

    public ShoppingTask(String whatToBuy, double quantity) {
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        if (quantity < 5) {
            //do sth
        } else {
            //do sth else
        }
        taskExecuted = true;

    }

    @Override
    public String getTaskName() {
        return "shopping";
    }

    @Override
    public boolean isTaskExecuted() {
        return taskExecuted;
    }
}
