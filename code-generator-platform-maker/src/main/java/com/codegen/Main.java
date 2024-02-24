package com.codegen;

import com.codegen.maker.generator.main.GenerateTemplate;
import com.codegen.maker.generator.main.MainGenerator;
import com.codegen.maker.generator.main.ZipGenerator;
import freemarker.template.TemplateException;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws TemplateException, IOException, InterruptedException {
//        MainGenerator mainGenerator = new MainGenerator();
//        mainGenerator.doGenerate();
        GenerateTemplate generateTemplate = new ZipGenerator();
        generateTemplate.doGenerate();
    }
}
