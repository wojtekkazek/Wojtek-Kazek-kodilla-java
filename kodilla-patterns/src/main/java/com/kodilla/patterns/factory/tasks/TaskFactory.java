package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final Task createTask(final TaskClass taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask(TaskClass.SHOPPING, "anything", 5);
            case PAINTING:
                return new PaintingTask(TaskClass.PAINTING, "Blue", "anything");
            case DRIVING:
                return new DrivingTask(TaskClass.DRIVING, "anywhere", "Car");
            default:
                return null;
        }
    }
}
