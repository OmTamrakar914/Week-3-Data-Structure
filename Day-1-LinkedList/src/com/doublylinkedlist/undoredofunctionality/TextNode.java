package com.doublylinkedlist.undoredofunctionality;

public class TextNode {
    String state;
    TextNode next,prev;

    public TextNode(String state){
        this.state=state;
        this.next=null;
        this.prev=null;
    }
}
