package com.springbootdev.springcloud.examples.departmentservice;

import org.springframework.boot.actuate.autoconfigure.security.servlet.EndpointRequest;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
public class ActuatorSecurity extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
                 http.csrf().disable()
                .authorizeRequests()
                .requestMatchers(EndpointRequest.to("health","info")).permitAll()
                .requestMatchers(EndpointRequest.toAnyEndpoint()).hasRole("USER")
                .antMatchers("/**").hasRole("USER")
                .and()
                .httpBasic();

    }


}

