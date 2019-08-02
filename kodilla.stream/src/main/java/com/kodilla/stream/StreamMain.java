package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import com.kodilla.stream.forumuser.ForumUserSex;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum forum = new Forum();
        Map<Integer, ForumUser> mapOfUsers = forum.getUsersList().stream()
                .filter(forumUser -> forumUser.getSex() == ForumUserSex.M)
                .filter(forumUser -> forumUser.getBirthDate().getYear() <= LocalDate.now().getYear()-20)
                .filter(forumUser -> forumUser.getNoOfPublishedPosts()>=1)
                .collect(Collectors.toMap(ForumUser::getUserSignature,forumUser -> forumUser));

        System.out.println("# elements: " + mapOfUsers.size());
        mapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
