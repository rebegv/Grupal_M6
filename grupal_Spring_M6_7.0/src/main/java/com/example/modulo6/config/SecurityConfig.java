package com.example.modulo6.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


import static org.springframework.security.web.util.matcher.AntPathRequestMatcher.antMatcher;


@Configuration
@EnableWebSecurity
public class SecurityConfig{


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
        http
                .authorizeRequests(authorize ->
                {
                    authorize.requestMatchers(antMatcher("/inicio")).permitAll();
                    /*authorize.requestMatchers(antMatcher("/cliente")).hasRole("Cliente");
                    authorize.requestMatchers(antMatcher("/administrativo")).hasRole("Administrativo");
                    authorize.requestMatchers(antMatcher("/profesional")).hasRole("Profesional");*/
                    authorize.anyRequest().authenticated();
                })
                .formLogin()
                    .defaultSuccessUrl("/inicio", true)
                .and()
                .httpBasic();
        return http.build();
    }

    /*@Bean
    public PasswordEncoder passwordEncoder(){
        return NoOpPasswordEncoder.getInstance();
    }

    @Bean
    SecurityFilterChain authenticationManager(HttpSecurity http, PasswordEncoder passwordEncoder) throws Exception{
        http
                .getSharedObject(AuthenticationManagerBuilder.class)
                .userDetailsService(userDetailsService)
                .passwordEncoder(passwordEncoder);
        return http.build();
    }*/

}
