package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task {
    private TaskClass taskClass;
    private String taskName;
    private String whatToBuy;
    private double quantity;

    public ShoppingTask(TaskClass taskClass, String whatToBuy, double quantity) {
        this.taskClass = taskClass;
        this.taskName = taskClass.getTaskName();
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
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
        if (quantity < 5) {
            return true;
        }
        return false;
    }
}
