package theinternet;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

import java.util.Collection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTest {

    @Test
    void  checkDnDOfElements() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-b").dragAndDropTo("#column-a");
        ElementsCollection collectionOfColumns = $$("#columns div.column");
        collectionOfColumns.get(0).shouldHave(text("B"));
        collectionOfColumns.get(1).shouldHave(text("A"));
    }
}
