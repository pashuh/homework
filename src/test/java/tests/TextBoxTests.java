package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TextBoxTests {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
    }

    @Test
    void successfulTest () {
        open("/automation-practice-form");

        $("[id=firstName"]).setValue("")
        $("[id=firstName"]).setValue("")

        firstName lastName  userEmail   userNumber  dateOfBirthInput    1hwfws3 currentAddress
    }

}
