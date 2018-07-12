package com.xsk.filter.filter;

public interface OHttpRequestFilter {
    interface OHttpReqFilter {
        void canContinue(boolean isOK);
    }

    boolean filter(Object object);
}
