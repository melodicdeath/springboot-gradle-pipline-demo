package com.cptmcp.cicd.cotroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.info.BuildProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class AppController {
    @Autowired
    private BuildProperties buildProperties;

    @GetMapping("/version")
    public String getVersion() {
        return String.format("%s,%s",buildProperties.getVersion(),buildProperties.getTime());
    }
}
