package pro.sky.java.course2.homework4;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public class EmployeeNotFoundException extends RuntimeException {
    }
