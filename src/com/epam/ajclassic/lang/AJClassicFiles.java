package com.epam.ajclassic.lang;

import com.epam.ajclassic.icons.ICO;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class AJClassicFiles extends LanguageFileType {
    public static final AJClassicFiles FILE = new AJClassicFiles();

    protected AJClassicFiles() {
        super(AJSyntaxLang.AJCLASSIC_INST);
    }

    @NotNull
    @Override
    public String getName() {
        return "AspectJ file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "AspectJ language extension file (.aj)";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "aj";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return ICO.ASPECT;
    }
}
