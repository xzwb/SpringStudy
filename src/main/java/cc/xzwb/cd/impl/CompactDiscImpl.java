package cc.xzwb.cd.impl;

import cc.xzwb.cd.CompactDisc;
import org.springframework.stereotype.Component;

@Component
public class CompactDiscImpl implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
