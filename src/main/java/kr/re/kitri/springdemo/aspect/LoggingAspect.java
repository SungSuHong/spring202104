package kr.re.kitri.springdemo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    public static Logger log = LoggerFactory.getLogger(LoggingAspect.class);

    @Before("execution(* kr.re.kitri.springdemo.controller.ArticleController.*(..))")
    public void logging(JoinPoint joinPoint) {
        log.info("AOP 기능으로 로그를 남깁니다......");
    }
}
