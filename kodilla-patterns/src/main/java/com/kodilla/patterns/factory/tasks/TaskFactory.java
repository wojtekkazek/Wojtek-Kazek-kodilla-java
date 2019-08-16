package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task doTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask("shopping", "anything", 5);
            case PAINTING:
                return new PaintingTask("painting", "Blue", "anything");
            case DRIVING:
                return new DrivingTask("driving", "anywhere", "Car");
            default:
                return null;
        }
    }
}
