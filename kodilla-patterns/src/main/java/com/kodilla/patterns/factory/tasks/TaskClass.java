package com.kodilla.patterns.factory.tasks;

public enum TaskClass {
    SHOPPING("shopping"), PAINTING("painting"), DRIVING("driving");

    final String taskName;

    TaskClass(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }
}
