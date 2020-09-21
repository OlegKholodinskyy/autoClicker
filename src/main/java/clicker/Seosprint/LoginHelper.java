package clicker.Seosprint;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by oleg on 24.05.2020.
 */
public class LoginHelper {

    private static String loginSeo;
    private static String passSeo;

    public static String getLoginSeo() {
        return loginSeo;
    }

    public static String getPassSeo() {
        return passSeo;
    }

    static {

        Properties property = new Properties();
        FileInputStream fis;


        try {
            fis = new FileInputStream("./src/main/resources/login.properties");
            property.load(fis);

            loginSeo = property.getProperty("loginSeo");
            passSeo = property.getProperty("passSeo");
        } catch (IOException e) {
            System.err.println("ОШИБКА: Файл свойств отсуствует!");
        }
    }
}