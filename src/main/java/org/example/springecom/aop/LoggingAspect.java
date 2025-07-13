package org.example.springecom.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {
    public static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);
    @Before("execution (* org.example.springecom.Service.ProductService.*(..))")

    public void logMethodCall() {
        logger.info("Method Called ");
    }
}
