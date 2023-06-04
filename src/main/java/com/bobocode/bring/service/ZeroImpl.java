package com.bobocode.bring.service;

import com.bobocode.bring.annotations.Bean;

@Bean
public class ZeroImpl implements Zero {
    @Override
    public void invoke() {
        System.out.println("hello from zero");
    }
}