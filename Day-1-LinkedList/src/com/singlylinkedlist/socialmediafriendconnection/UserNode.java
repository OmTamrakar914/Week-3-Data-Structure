package com.singlylinkedlist.socialmediafriendconnection;

import java.util.List;
import java.util.ArrayList;

public class UserNode {
    int userId;
    String userName;
    int age;
    List<Integer> friendIds;
    UserNode next;

    public UserNode(int userId, String userName, int age) {
        this.userId = userId;
        this.userName = userName;
        this.age = age;
        this.friendIds = new ArrayList<>();
        this.next=null;
    }
}