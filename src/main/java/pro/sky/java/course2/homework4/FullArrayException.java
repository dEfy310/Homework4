package pro.sky.java.course2.homework4;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class FullArrayException {
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public static class ArrayIsFullException extends RuntimeException {
    }
}
