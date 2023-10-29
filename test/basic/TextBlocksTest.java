package basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


class TextBlocksTest {

    TextBlocks textBlocks = new TextBlocks();

    @Test
    void givenAnOldStyleMultilineString_whenComparing_thenEqualsTextBlock() {
        String expected = "<html>\n"
                + "\n"
                + "    <body>\n"
                + "        <span>example text</span>\n"
                + "    </body>\n"
                + "</html>";
        assertEquals(textBlocks.getBlockOfHtml(), expected);
    }

    @Test
    void givenAnOldStyleString_whenComparing_thenEqualsTextBlock() {
        String expected = "<html>\n\n    <body>\n        <span>example text</span>\n    </body>\n</html>";
        assertEquals(textBlocks.getBlockOfHtml(), expected);
    }

    @Test
    void givenAnIndentedString_thenMatchesIndentedOldStyle() {
        assertEquals(textBlocks.getNonStandardIndent(), "    Indent\n");

        System.out.println(textBlocks.getTextWithEscapes());

        System.out.println(textBlocks.getTextWithCarriageReturns());

        System.out.println(textBlocks.getIgnoredNewLines());
    }
    @Test
    void givenAStringWithEscapedNewLines_thenTheResultHasNoNewLines() {
        String expected = "This is a long test which looks to have a newline but actually does not";
        assertEquals(textBlocks.getIgnoredNewLines(), expected);
    }


    @Test
    void givenAStringWithEscapesSpaces_thenTheResultHasLinesEndingWithSpaces() {
        System.out.println("""
            Some parameter: %s
            """.formatted("sample"));

        System.out.printf("Age is %d", 25);
        System.out.printf("Age = %d, Birth Year = %d\n", 25, 1998);
        System.out.printf("Age = %.2f\n", (float) 25);
        for (int i= 1; i <= 10000; i = i *= 10) {
            System.out.printf("Printing %6d %n", i);
        }
        String formattedString = String.format("Age is %d", 25);
        System.out.println(formattedString);
        formattedString = "Age is %d".formatted(25);
        System.out.println(formattedString);
    }


}