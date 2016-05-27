package com.epam.ajclassic.lang;

import com.intellij.lang.Language;

public class AJSyntaxLang extends Language {
    public static final AJSyntaxLang AJCLASSIC_INST = new AJSyntaxLang();
    private AJSyntaxLang() {
        super("AspectJClassic");
    }
}
