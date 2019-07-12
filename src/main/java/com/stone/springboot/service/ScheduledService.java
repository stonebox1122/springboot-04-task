package com.stone.springboot.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * @author stone
 * @date 2019/7/12 16:32
 * description
 */
@Service
public class ScheduledService {

    // "0 * * * * MON-FRI"
    @Scheduled(cron = "0 * * * * MON-FRI")
    public void hello(){
        System.out.println("hello");
    }
}
