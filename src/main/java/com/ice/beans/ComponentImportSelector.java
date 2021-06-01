package com.ice.beans;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.lang.Nullable;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 13:51
 */
public abstract class ComponentImportSelector implements ImportSelector {

    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        String[] basePackages = {"com.ice.beans.Car"};
        String[] beans = selectImports(basePackages);
        return beans;
    }

    /**
     * 容器注入
     *
     * @param basePackages 全限定类名路径
     * @return
     */
    @Nullable
    protected abstract String[] selectImports(String... basePackages);

}
