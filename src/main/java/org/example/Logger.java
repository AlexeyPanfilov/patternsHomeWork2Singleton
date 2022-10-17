package org.example;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Logger {

    private static int num;
    private static Logger instance;

    private Logger() {
    }

    public void log (String msg) {
        System.out.println("[" +
                LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy.MM.dd kk:mm:ss")) + " "
                + (++num) + "] " + msg);
    }

    public static Logger getInstance() {
        if (instance == null) instance = new Logger();
        return instance;
    }
}
