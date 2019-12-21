package com.kodilla.patterns2.observer.homework;

public class Mentor implements TaskObserver {
    private final String mentorName;
    private int updateCount = 0;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }

    @Override
    public void update (StudentTasks studentTasks) {
        System.out.println(mentorName + ": New task added by " + studentTasks.getStudentName() +
                " into list: " + studentTasks.getTasksListName() + "\n" +
                "please approve task " + studentTasks.getTasks().get(studentTasks.getTasks().size()-1) + " ASAP !!!" + "\n" +
                " (total: " + studentTasks.getTasks().size() + " tasks)" + "\n");
        updateCount++;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
