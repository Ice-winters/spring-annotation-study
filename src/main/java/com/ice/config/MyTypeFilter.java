package com.ice.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Set;

/**
 * @author : Ice-winters
 * @since : 2021-05-28 21:20
 */
public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 获取当前类的注解信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前正在扫描的类的类信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前类的资源信息（类路径）
        Resource resource = metadataReader.getResource();

        String className = classMetadata.getClassName();
        //System.out.println(">>>>>"+ className);

        Set<String> annotationTypes = annotationMetadata.getAnnotationTypes();
        for (String annotationType : annotationTypes) {

            System.out.println("annotationType = "+ annotationType);
        }

        // 带有TestIce注解的才会被扫描后加入容器中
        //.equals(annotationType);
        return annotationTypes.contains("com.ice.anno.TestIce");
    }
}
