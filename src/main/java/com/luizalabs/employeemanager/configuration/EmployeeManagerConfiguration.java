package com.luizalabs.employeemanager.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan("com.luizalabs.employeemanager")
@EnableJpaRepositories("com.luizalabs.employeemanager")
@EnableTransactionManagement
public class EmployeeManagerConfiguration {

}
