package basic;

public class TextBlocks {

    public String getTextWithEscapes() {
        return """
                "fun" with
                whitespace
                and other escapes \"""
                """;
    }

    public String getTextWithCarriageReturns() {
        return """
                separated with\n\r
                carriage returns""";
    }

    public String getIgnoredNewLines() {
        return """
            This is a long test which looks to \
            have a newline but actually does not""";
    }

    public String getEscapedSpaces() {
        return """
            line 1·······
            line 2·······\s
            """;
    }
    public String getBlockOfHtml() {
        return """
                <html>

                    <body>
                        <span>example text</span>
                    </body>
                </html>""";
    }

    public String getNonStandardIndent() {
        return """
                    Indent
                """;
    }
}
