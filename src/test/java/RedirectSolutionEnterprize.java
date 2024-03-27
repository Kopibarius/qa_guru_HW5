import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RedirectSolutionEnterprize {

    @Test
    void checkSolutionEnterprize() {
        open("https://github.com/");
        $(byText("Solutions")).hover();
        $(By.linkText("Enterprise")).click();
        $("#hero-section-brand-heading").shouldHave(
                text("The AI-powered"),
                text("developer platform."));
        sleep(5000);
    }
}
