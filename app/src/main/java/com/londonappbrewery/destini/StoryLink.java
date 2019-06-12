package com.londonappbrewery.destini;

import java.util.HashMap;

public class StoryLink {
    int linkTo;
    int story;
    HashMap<Integer, Integer> map;

    public StoryLink(int s, int l) {
        linkTo = l;
        story = s;
    }

    public int getLinkTo() {
        return linkTo;
    }

    public int getStory() {
        return story;
    }

    public void setLinkTo(int linkTo) {
        this.linkTo = linkTo;
    }

    public void setStory(int story) {
        this.story = story;
    }
}
