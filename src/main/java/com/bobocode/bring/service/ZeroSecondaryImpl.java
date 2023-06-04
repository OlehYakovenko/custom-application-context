package com.bobocode.bring.service;

import com.bobocode.bring.annotations.Bean;
import lombok.Data;
import lombok.ToString;

@Bean(beanName = "zzero")
@Data
@ToString
public class ZeroSecondaryImpl implements Zero{
    @Override
    public void invoke() {

    }
}
