package kr.re.kitri.springdemo.exception;

import org.postgresql.util.PSQLException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@ControllerAdvice
@RestController
public class GlobalExceptionHandler {

    @ExceptionHandler(value = ArithmeticException.class)
    public String handleArithmaticException(ArithmeticException ae) {
        return "0으로 나누면 안되요..";
    }

    @ExceptionHandler(value = PSQLException.class)
    public String handlePSQLException(PSQLException pe) {
        return "DB에러입니다... ";
    }


}
