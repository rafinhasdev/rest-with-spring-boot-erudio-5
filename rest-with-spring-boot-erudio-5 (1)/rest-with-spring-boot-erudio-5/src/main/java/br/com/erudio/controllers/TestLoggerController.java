package br.com.erudio.controllers;


import br.com.erudio.services.PersonServices;
import org.aspectj.weaver.ast.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
public class TestLoggerController {

    private Logger logger = LoggerFactory.getLogger(TestLoggerController.class.getName());


    @GetMapping("/test")
    public String testLog(){

        logger.debug("This is an DEBUG log");
        logger.info(("This is an INFO log"));
        logger.warn(("This is an WARN log"));
        logger.error(("This is an ERROR log"));

        return "Logs generated successfully";
    }


}
