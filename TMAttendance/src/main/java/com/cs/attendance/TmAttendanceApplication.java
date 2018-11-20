package com.cs.attendance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class TmAttendanceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TmAttendanceApplication.class, args);
	}
}
