package utils;

public class Paths {
    private static final String PROJECT_PATH = System.getProperty("user.dir");
    private static final String GECKO_DRIVER_PATH = PROJECT_PATH + "\\src\\main\\java\\drivers\\geckodriver.exe";
    

public static String getProjectPath(){
    return PROJECT_PATH;
}
public static String getGecoPath(){
    return GECKO_DRIVER_PATH;
}


}
