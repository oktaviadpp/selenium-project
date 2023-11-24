package app.entities.authentication;

public class LogOut_001_001_userSuccessfullyLogout extends Log_001_001_userSuccessfullyLogin_v2 {
    public static void main(String[] args) throws InterruptedException {
//        Log_001_001_userSuccessfullyLogin_v2 login = new Log_001_001_userSuccessfullyLogin_v2();
//        WebDriver driver = new ChromeDriver();

        driver.get(login());
        System.out.println("sukses");
    }
}
