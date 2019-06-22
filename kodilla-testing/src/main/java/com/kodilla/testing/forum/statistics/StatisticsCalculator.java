package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {

    Statistics statistics;
    private int usersCount;
    private int postsCount;
    private int commentsCount;
    private double postsPerUserAverage;
    private double commentsPerUserAverage;
    private double commentsPerPostAverage;

    public StatisticsCalculator(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics () {

        usersCount = statistics.usersNames().size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if(usersCount == 0) {
            System.out.println("Average of posts per user can't be calculated as there are no users");
        } else {
            postsPerUserAverage = (double)postsCount / usersCount;
        }

        if(usersCount == 0) {
            System.out.println("Average of comments per user can't be calculated as there are no users");
        } else {
            commentsPerUserAverage = (double)commentsCount / usersCount;
        }

        if(postsCount == 0) {
            System.out.println("Average of comments per posts can't be calculated as there are no posts");
        } else {
            commentsPerPostAverage = (double)commentsCount / postsCount;
        }

    }

    public void showStatistics (Statistics statistics) {

        System.out.println("Forum users: " + usersCount);
        System.out.println("Posts: " + postsCount);
        System.out.println("Comments: " + commentsCount);
        System.out.println("Average of posts per user: " + postsPerUserAverage);
        System.out.println("Average of comments per user: " + commentsPerUserAverage);
        System.out.println("Average of comments per post: " + commentsPerPostAverage);
    }

    public int getUsersCount() {
        return usersCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getPostsPerUserAverage() {
        return postsPerUserAverage;
    }

    public double getCommentsPerUserAverage() {
        return commentsPerUserAverage;
    }

    public double getCommentsPerPostAverage() {
        return commentsPerPostAverage;
    }
}
