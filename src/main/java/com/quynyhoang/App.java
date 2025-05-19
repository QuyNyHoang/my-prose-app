package com.quynyhoang;
import com.quynyhoang.SimpleSentence;
import de.htw_berlin.fb4.ossd.prose.ProseBuilder;
import de.htw_berlin.fb4.ossd.prose.Sentence;
import java.util.List;

public class App {
    public static void main(String[] args) {
        Sentence s1 = new SimpleSentence("Hello world");
        Sentence s2 = new SimpleSentence("GitHub Packages are cool.");

        ProseBuilder builder = new ProseBuilder();
	builder.register(s1);
	builder.register(s2);
	System.out.println(builder.get());

    }
}

