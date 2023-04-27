package testLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest
{
    public static void main(String[] args) {
        // Khởi tạo WebDriver
        WebDriver driver = new ChromeDriver();

        // Mở trang web
        driver.get("https://example.com/login");

        // Đăng nhập với tài khoản thứ nhất
        login(driver, "username1", "password1");

        // Kiểm tra xem đã đăng nhập thành công hay chưa
        WebElement welcomeMessage = driver.findElement(By.id("welcomeMessage"));
        String message = welcomeMessage.getText();
        if (message.equals("Welcome, username1!")) {
            System.out.println("Đăng nhập thành công với tài khoản 1!");
        } else {
            System.out.println("Đăng nhập thất bại với tài khoản 1!");
        }

        // Đăng xuất khỏi tài khoản thứ nhất
        logout(driver);

        // Đăng nhập với tài khoản thứ hai
        login(driver, "username2", "password2");

        // Kiểm tra xem đã đăng nhập thành công hay chưa
        welcomeMessage = driver.findElement(By.id("welcomeMessage"));
        message = welcomeMessage.getText();
        if (message.equals("Welcome, username2!")) {
            System.out.println("Đăng nhập thành công với tài khoản 2!");
        } else {
            System.out.println("Đăng nhập thất bại với tài khoản 2!");
        }

        // Đăng xuất khỏi tài khoản thứ hai
        logout(driver);

        // Đăng nhập với tài khoản thứ ba
        login(driver, "username3", "password3");

        // Kiểm tra xem đã đăng nhập thành công hay chưa
        welcomeMessage = driver.findElement(By.id("welcomeMessage"));
        message = welcomeMessage.getText();
        if (message.equals("Welcome, username3!")) {
            System.out.println("Đăng nhập thành công với tài khoản 3!");
        } else {
            System.out.println("Đăng nhập thất bại với tài khoản 3!");
        }

        // Đóng trình duyệt
        driver.quit();
    }

    public static void login(WebDriver driver, String username, String password)
    {
        // Nhập tên đăng nhập và mật khẩu
        WebElement usernameField = driver.findElement(By.id("username"));
        usernameField.sendKeys(username);

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys(password);

        // Nhấn nút đăng nhập
        WebElement loginButton = driver.findElement(By.id("loginButton"));
        loginButton.click();
    }

    public static void logout(WebDriver driver)
    {
        // Nhấn nút đăng xuất
        WebElement logoutButton = driver.findElement(By.id("logoutButton"));
        logoutButton.click();
    }
}
