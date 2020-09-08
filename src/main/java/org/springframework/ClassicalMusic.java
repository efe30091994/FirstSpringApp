package org.springframework;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "classical music";
    }
}
