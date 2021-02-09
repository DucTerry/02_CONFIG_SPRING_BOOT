package com.ndangduc.bn.configspringboot.controller;

import com.ndangduc.bn.configspringboot.bean.BlogProperties;
import com.ndangduc.bn.configspringboot.config.ConfigBean;
import com.ndangduc.bn.configspringboot.config.TestConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ducnd")
public class BeanController {
    @Autowired
    private BlogProperties blogProperties;

    @Autowired
    private ConfigBean configBean;

    @Autowired
    private TestConfigBean testConfigBean;

    @RequestMapping(value = "/blog-properties", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String blogProperties(){
        return blogProperties.getName() + blogProperties.getTitle();
    }


    @RequestMapping(value = "/config-bean", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String configBean(){
        return configBean.getWholeTitle();
    }


    @RequestMapping(value = "/test-config-bean", produces = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public String testConfigBean(){
        return testConfigBean.getName() + testConfigBean.getAge();
    }
}
