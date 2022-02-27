import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOptions {

    public static ChromeOptions setChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("userAutomationExtension",false);
        options.addArguments("--start-maximized");
        return options;

    }
}
