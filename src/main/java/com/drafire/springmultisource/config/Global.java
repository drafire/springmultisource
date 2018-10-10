package com.drafire.springmultisource.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Global {
    @Value("${ds.sell.url}")
    private String sellUrl;
    @Value("${ds.bank.url}")
    private String bank;

    public String getSellUrl() {
        return sellUrl;
    }

    public String getBank() {
        return bank;
    }
}
