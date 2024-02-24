package com.codegen.web.model.dto.generator;

import com.codegen.web.meta.Meta;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 创建请求
 */
@Data
public class GeneratorAddRequest implements Serializable {

    /**
     * 名称
     */
    private String projectName;

    /**
     * 描述
     */
    private String description;

    /**
     * 基础包
     */
    private String basePackage;

    /**
     * 版本
     */
    private String version;

    /**
     * 作者
     */
    private String author;

    /**
     * 标签列表（json 数组）
     */
    private List<String> tags;

    /**
     * 图片
     */
    private String picture;

    /**
     * 文件配置（json字符串，就是对象）
     */
    private Meta.FileConfig fileConfig;

    /**
     * 模型配置（json字符串，就是对象）
     */
    private Meta.ModelConfig modelConfig;

    /**
     * 代码生成器产物路径
     */
    private String distPath;

    /**
     * 状态
     */
    private Integer projectStatus;

    private static final long serialVersionUID = 1L;
}