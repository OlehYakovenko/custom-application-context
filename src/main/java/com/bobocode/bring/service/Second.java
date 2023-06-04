package com.bobocode.bring.service;

import com.bobocode.bring.annotations.Bean;
import com.bobocode.bring.annotations.Inject;
import com.bobocode.bring.annotations.Qualifier;
import lombok.Data;
import lombok.ToString;

@Bean
@Data
@ToString
public class Second {
    @Inject
    @Qualifier(name = "zzero")
    private Zero zero;
}
