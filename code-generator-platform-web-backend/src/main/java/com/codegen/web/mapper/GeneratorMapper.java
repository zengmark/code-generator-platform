package com.codegen.web.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.codegen.web.model.entity.Generator;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author 13123
 * @description 针对表【generator(代码生成器)】的数据库操作Mapper
 * @createDate 2024-02-18 23:20:20
 * @Entity generator.domain.Generator
 */
public interface GeneratorMapper extends BaseMapper<Generator> {
    @Select("SELECT id, distPath FROM generator WHERE isDelete = 1")
    List<Generator> listDeletedGenerator();
}




