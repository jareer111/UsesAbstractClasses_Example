package com.jareer.abstractexample_02.v2;

import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport{

    private final Pattern PATTERN=Pattern.compile("^[a-zA-Z0-9.!#$%&’*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$");
    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Emails ";
    }
}
