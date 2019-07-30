package com.kodilla.stream.forumuser;

public enum ForumUserSex {

    M('M'), F('F');

    final char sex;

    ForumUserSex(char sex) {
        this.sex = sex;
    }

    public char getSex() {
        return sex;
    }
}
