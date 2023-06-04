package com.bobocode.bring.service;

import com.bobocode.bring.annotations.Bean;
import com.bobocode.bring.annotations.Inject;
import lombok.Data;
import lombok.ToString;

@Bean(beanName = "third")
@Data
@ToString
public class ThirdBean {
    @Inject
    private First first;
    @Inject
    private Second second;
}
