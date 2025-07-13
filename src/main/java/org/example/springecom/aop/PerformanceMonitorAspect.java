package org.example.springecom.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class PerformanceMonitorAspect {
    public static final Logger logger= LoggerFactory.getLogger(PerformanceMonitorAspect.class);

    @Around("execution (* org.example.springecom.Service.ProductService.*(..))")
    public Object monitorTime(ProceedingJoinPoint joinPoint) throws Throwable {
        Long startTime = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        Long endTime = System.currentTimeMillis();
        logger.info("Time taken by "+joinPoint.getSignature().getName()+" "+(endTime-startTime)+" ms");
        return result;
    }


}
