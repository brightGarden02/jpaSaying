package jpaWiseSaying.jpaSaying;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class WiseSaying {

    private int idx;
    private String author;
    private String content;


    public WiseSaying(int idx, String author, String content) {
        this.idx = idx;
        this.author = author;
        this.content = content;
    }
}
