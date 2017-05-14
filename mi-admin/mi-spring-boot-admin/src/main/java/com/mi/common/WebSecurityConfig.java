//package com.mi.common;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @author yesh
// *         (M.M)!
// *         Created by 2017/5/15.
// */
//@Configuration
//@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http
////                .authorizeRequests()
////                .antMatchers("/img/**", "/*.css","/*").permitAll()
////                .anyRequest().authenticated();
////        http
////                .formLogin()
////                .defaultSuccessUrl("/")
////                .loginPage("/login.html")
////                .permitAll()
////                .and()
////                .logout()
////                .permitAll();
////    }
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder authManagerBuilder) throws Exception {
////        authManagerBuilder.inMemoryAuthentication()
////                .withUser("user").password("password").roles("USER");
////    }
//
//
//}
