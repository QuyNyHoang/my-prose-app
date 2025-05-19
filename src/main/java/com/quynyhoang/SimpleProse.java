package com.quynyhoang;

import java.util.List;
import java.util.stream.Collectors;

public class SimpleProse implements Prose {
    private List<Sentence> sentences;

    public SimpleProse(List<Sentence> sentences) {
        this.sentences = sentences;
    }

    @Override
    public String getText() {
        return sentences.stream()
                .map(s -> String.join(" ", s.getWords()))
                .collect(Collectors.joining(". ")) + ".";
    }
}

