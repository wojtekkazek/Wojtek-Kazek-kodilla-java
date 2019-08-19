package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public final Task createTask(final TaskName taskName) {
        switch (taskName) {
            case SHOPPING:
                return new ShoppingTask("anything", 5);
            case PAINTING:
                return new PaintingTask("Blue", "anything");
            case DRIVING:
                return new DrivingTask("anywhere", "Car");
            default:
                return null;
        }
    }
}
