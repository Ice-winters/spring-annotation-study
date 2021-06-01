package com.ice.config;

import com.ice.beans.MyApplicationContext;
import com.ice.beans.MyBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author : Ice-winters
 * @since : 2021-06-01 14:56
 */
@Configuration
@Import({MyApplicationContext.class, MyBeanPostProcessor.class})
public class ApplicationContextConfig {




}
