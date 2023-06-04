package com.bobocode.bring.exceptions;

import java.util.NoSuchElementException;

public class NoSuchBeanException extends NoSuchElementException {
    public NoSuchBeanException(String s){
        super(s);
    }
}
