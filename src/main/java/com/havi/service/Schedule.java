package com.havi.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class Schedule {

    @Scheduled(cron = "0/1 * * * * *")
    public void logger() {
        log.info("{\"timestamp\": \"21-12-01\", message: {\"content\": \"hello world!\"}}");
    }
}
