package com.codegen.web.manager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.Arrays;

@SpringBootTest
class CosManagerTest {

    @Resource
    private CosManager cosManager;

    @Test
    void deleteObject() {
        cosManager.deleteObject("/generator_make_template/1");
    }

    @Test
    void deleteObjects() {
        cosManager.deleteObjects(Arrays.asList("test/test1.jpeg",
                "test/test2.jpeg"
        ));
    }

    @Test
    void deleteDir() {
        cosManager.deleteDir("/generator_picture/1/");
    }
}