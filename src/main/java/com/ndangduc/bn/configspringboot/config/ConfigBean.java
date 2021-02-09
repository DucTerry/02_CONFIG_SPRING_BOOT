package com.ndangduc.bn.configspringboot.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;


@ConfigurationProperties(prefix = "ducnd.blog")
@Data
public class ConfigBean {
    @Value("${ducnd.blog.name}")
    private String name;

    @Value("${ducnd.blog.title}")
    private String title;

    @Value("${ducnd.blog.whole.title}")
    private String wholeTitle;
}
