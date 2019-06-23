package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {

    @Test
    public void whenStatisticsHave0Post_thanCalculatePostsCount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCalculator.getPostsCount());
    }

    @Test
    public void whenStatisticsHave0Post_thanCalculatePostsPerUserAverage() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>(){{ add("bolek");}});

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getPostsPerUserAverage(), 0.01);
    }

    @Test
    public void whenStatisticsHave0Post_thanCalculateCommentsPerPost() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerPostAverage(), 0.01);
    }

    @Test
    public void whenStatisticsHave1000Post_testPostsCount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(1000, statisticsCalculator.getPostsCount());
    }

    @Test
    public void whenStatisticsHave1000Post_testPostsPerUserAverage() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>(){{add("bolek");}});

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(1000.0, statisticsCalculator.getPostsPerUserAverage(), 0.01);
    }

    @Test
    public void whenStatisticsHave1000Post_thanCalculateCommentsPerPost() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerPostAverage(), 0.01);
    }

    @Test
    public void whenStatisticsHave0Comments_thanCalculateCommentsCount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCalculator.getCommentsCount());
    }

    @Test
    public void whenStatisticsHave0Comments_thanCalculateCommentsPerUser() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>(){{add("bolek");}});

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsCount(),0.01);
    }

    @Test
    public void whenStatisticsHave0Comments_thanCalculateCommentsPerPost() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);
        when(statisticsMock.postsCount()).thenReturn(1);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerPostAverage(),0.01);
    }

    @Test
    public void whenStatisticsHaveLessCommentsThenPosts_thanCalculateCommentsPerPost() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(5);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.5, statisticsCalculator.getCommentsPerPostAverage(),0.01);
    }

    @Test
    public void whenStatisticsHaveMoreCommentsThenPosts_thanCalculateCommentsPerPost() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(30);
        when(statisticsMock.postsCount()).thenReturn(10);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(3.0, statisticsCalculator.getCommentsPerPostAverage(),0.01);
    }

    @Test
    public void whenStatisticsHave0Users_thanCalculateUserCount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0, statisticsCalculator.getUsersCount(),0.01);
    }

    @Test
    public void whenStatisticsHave0Users_thanCalculatePostsPerUser() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.postsCount()).thenReturn(1);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getPostsPerUserAverage(),0.01);
    }

    @Test
    public void whenStatisticsHave0Users_thanCalculateCommentsPerUser() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<>());
        when(statisticsMock.commentsCount()).thenReturn(1);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.0, statisticsCalculator.getCommentsPerUserAverage(),0.01);
    }

    @Test
    public void whenStatisticsHave100Users_thanCalculateUsersCount() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>()
                                                     {{for(int i=0; i<100; i++){
                                                         add("bolek");}
                                                     }}
        );

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(100, statisticsCalculator.getUsersCount(),0.01);
    }

    @Test
    public void whenStatisticsHave100Users_thanCalculatePostsPerUser() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>()
                                                     {{for(int i=0; i<100; i++){
                                                         add("bolek");}
                                                     }}
        );
        when(statisticsMock.postsCount()).thenReturn(20);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(0.2, statisticsCalculator.getPostsPerUserAverage(),0.01);
    }

    @Test
    public void whenStatisticsHave100Users_thanCalculateCommentsPerUser() {

        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(new ArrayList<String>()
                                                     {{for(int i=0; i<100; i++){
                                                         add("bolek");}
                                                     }}
        );
        when(statisticsMock.commentsCount()).thenReturn(500);

        //When
        StatisticsCalculator statisticsCalculator = new StatisticsCalculator(statisticsMock);

        //Then
        Assert.assertEquals(5.0, statisticsCalculator.getCommentsPerUserAverage(),0.01);
    }

}

