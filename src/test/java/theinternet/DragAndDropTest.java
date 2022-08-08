package theinternet;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {


    @Test
    void  checkDnDOfElements() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-b").dragAndDropTo("#column-a");
        $("#column-a").shouldHave(text("B"));
        $("#column-b").shouldHave(text("A"));
    }
}
