package com.sparta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling //스프링 부트에서 스케줄러가 작동하게 한다.
@EnableJpaAuditing// 시간 자동 변경이 가능하게 한다.
@SpringBootApplication //스프링 부트임을 선언
public class PracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(PracticeApplication.class, args);
    }

}


