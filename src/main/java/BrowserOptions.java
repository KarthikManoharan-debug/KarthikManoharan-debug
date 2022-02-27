import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class BrowserOptions {

    public static ChromeOptions setChromeOptions() {
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("userAutomationExtension",false);
        options.addArguments("--start-maximized");
        options.addArguments("--disable-web-security");
        options.addArguments("--no-proxy-server");
        Map<String,Object> prefs= new HashMap<String,Object>();

        return options;

    }
}
