package com.ndangduc.bn.configspringboot.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class BlogProperties {

    @Value("${ducnd.blog.name}")
    private String name;

    @Value("${ducnd.blog.title}")
    private String title;

}
