import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
        System.out.println("App: " + props.getProperty("app.name"));
        System.out.println("Version: " + props.getProperty("app.version"));
    }
}
