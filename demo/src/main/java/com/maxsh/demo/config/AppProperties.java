package com.maxsh.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * MaProperties
 *
 * @author maxsc
 * @description: TODO
 * @date 2019/11/25
 */
@Component
@ConfigurationProperties(prefix="maxsh")
public class AppProperties {
    private String title;
    private String description;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
