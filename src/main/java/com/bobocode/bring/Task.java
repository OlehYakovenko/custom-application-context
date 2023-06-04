package com.bobocode.bring;

import com.bobocode.bring.context.ApplicationContext;
import com.bobocode.bring.context.ApplicationContextImpl;
import com.bobocode.bring.service.First;
import com.bobocode.bring.service.ThirdBean;

public class Task {
    public static void main(String[] args) {
        ApplicationContext appContext = new ApplicationContextImpl("com.bobocode.bring.service");
        First first = appContext.getBean(First.class);
        var third = appContext.getBean("third", ThirdBean.class);
//        var zero = appContext.getBean(Zero.class);

        System.out.println(first);
        System.out.println(third);
        System.out.println(third.getSecond());
//        System.out.println(zero);
    }
}
