package com.codegen.maker.model;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 动态模版配置
 */
@Data
public class DataModel {

    /**
     * 是否需要生成 .gitignore 文件
     */
    private boolean needGit;

    /**
     * 是否生成循环
     */
    private boolean loop;

    /**
     * 作者注释
     */
    private String author = "mark.zneg";

    /**
     * 输出信息
     */
    private String outputText = "sum = ";
}