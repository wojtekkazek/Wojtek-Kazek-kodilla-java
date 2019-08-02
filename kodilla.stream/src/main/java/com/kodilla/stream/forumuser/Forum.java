package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> usersList = new ArrayList<>();

    public Forum() {
        usersList.add(new ForumUser(01, "user1",ForumUserSex.M, LocalDate.of(2000, Month.JANUARY,1),10));
        usersList.add(new ForumUser(02, "user2",ForumUserSex.F, LocalDate.of(1950, Month.JANUARY,1),10));
        usersList.add(new ForumUser(03, "user3",ForumUserSex.M, LocalDate.of(1999, Month.JANUARY,1),10));
        usersList.add(new ForumUser(04, "user4",ForumUserSex.M, LocalDate.of(1980, Month.JANUARY,1),0));
    }

    public List<ForumUser> getUsersList() {
        return new ArrayList<>(usersList);
    }

}



