package com.whaim;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
public class Auto{

    @Value("${datagram.schema.root}")
    private String a;
    private String b;
    private String c;
    private String d;
}
