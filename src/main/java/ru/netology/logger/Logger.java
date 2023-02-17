package ru.netology.logger;

public class Logger {
    private static Logger instance;
    protected int num = 1;

    private Logger() {
    }

    public static Logger getInstance() {
        if (instance == null) return new Logger();
        else return instance;
    }

    public void log(String msg) {
        System.out.println("[" + num++ + "] " + msg);
    }

}
