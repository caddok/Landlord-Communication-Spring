package com.evtimov.landlordapp.landlordspring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories("com.evtimov.landlordapp.landlordspring.repositories.base")
public class JPAConfig {
}
