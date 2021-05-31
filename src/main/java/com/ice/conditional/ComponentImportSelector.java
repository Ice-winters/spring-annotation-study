package com.ice.conditional;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * 自定义逻辑，返回需要导入的组件
 *
 * @author : Ice-winters
 * @since : 2021-05-29 18:33
 */
public class ComponentImportSelector implements ImportSelector {

    // 返回值就是要导入到容器中的组件全类名
    // AnnotationMetadata: 当前标注@Import注解的类的所有注解信息
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {

//        importingClassMetadata.getann

        return new String[]{"com.ice.beans.Blue", "com.ice.beans.Yellow"};
    }
}
