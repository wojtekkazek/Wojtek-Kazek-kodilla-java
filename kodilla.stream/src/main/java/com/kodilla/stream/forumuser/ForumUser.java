package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private final int userSignature;
    private final String userName;
    private final char sex;
    private final LocalDate birthDate;
    private final int noOfPublishedPosts;

    public ForumUser(int userSignature, String userName, char sex, LocalDate birthDate, int noOfPublishedPosts) {
        this.userSignature = userSignature;
        this.userName = userName;
        this.sex = sex;
        this.birthDate = birthDate;
        this.noOfPublishedPosts = noOfPublishedPosts;
    }

    public int getUserSignature() {
        return userSignature;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
            return sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public int getNoOfPublishedPosts() {
        return noOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userSignature=" + userSignature +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthDate=" + birthDate +
                ", noOfPublishedPosts=" + noOfPublishedPosts +
                '}';
    }
}
