package com.javafortesters.example.chapter8;

import org.apache.hadoop.shaded.org.apache.commons.math3.exception.MathArithmeticException;

import java.io.IOException;

public class ZaloPayException {
    Throwable exception;

    public Exception showMessage() {
        if (exception instanceof IOException) {
            exception.printStackTrace();
        }

        return null;
    }
}

