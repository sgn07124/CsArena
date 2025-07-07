package project.CsArena.global.exception;

import jakarta.validation.Valid;
import java.time.LocalDate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import project.CsArena.global.common.response.code.ApiErrorCode;

@RestController
@RequestMapping("/test")
public class DummyTestController {

    @GetMapping("/custom")
    public void throwCustom() {
        throw new CustomException(ApiErrorCode.BAD_REQUEST_ERROR);
    }

    @GetMapping("/unknown")
    public void throwUnknown() {
        throw new RuntimeException("Unexpected error");
    }

    @PostMapping("/validate")
    public void validate(@RequestBody @Valid DummyRequest request) {
    }

    @GetMapping("/enum")
    public void enumError(@RequestParam DummyEnum type) {
    }

    @GetMapping("/date")
    public void dateError(@RequestParam LocalDate date) {
    }
}
