package project.CsArena.global.exception;

import lombok.Getter;
import project.CsArena.global.common.response.code.BaseErrorCode;

@Getter
public class CustomException extends RuntimeException {
    private final BaseErrorCode errorCode;

    public CustomException(BaseErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
