package github;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GithubCheckPlanTest {

    @Test
    void testComparePlansPage() {
        open("https://github.com/");

        $(".HeaderMenu").$(byText("Pricing")).hover();
        $(byLinkText("Plans")).click();
        $(".application-main").shouldHave(text("Choose the plan that’s right for you."));
    }
}