package pro.sky.java.course2.homework4;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class EmployeeNotFoundException {
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public static class NotFoundEmployeeException extends RuntimeException {
    }
}
