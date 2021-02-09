package com.ndangduc.bn.configspringboot;

import com.ndangduc.bn.configspringboot.config.ConfigBean;
import com.ndangduc.bn.configspringboot.config.TestConfigBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(
        {ConfigBean.class, TestConfigBean.class}
)
public class ConfigSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSpringBootApplication.class, args);
    }

}
