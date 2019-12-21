package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class StudentTasks implements TasksObservable {
    private final String studentName;
    private final String tasksListName;
    private final List<TaskObserver> observers;
    private final List<String> tasks;

    public StudentTasks(String studentName, String tasksListName) {
        this.studentName = studentName;
        this.tasksListName = tasksListName;
        observers = new ArrayList<>();
        tasks = new ArrayList<>();
    }

    @Override
    public void registerObserver (TaskObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        for (TaskObserver observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void removeObserver (TaskObserver observer) {
        observers.remove(observer);
    }

    public void addTask(String task) {
        tasks.add(task);
        notifyObserver();
    }

    public String getStudentName() {
        return studentName;
    }

    public String getTasksListName() {
        return tasksListName;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
