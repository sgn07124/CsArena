package project.CsArena.global.common.response;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import project.CsArena.global.common.response.code.ApiSuccessCode;

class ApiResponseTest {

    @Test
    @DisplayName("데이터 포함 응답 성공 테스트")
    public void resultTest() {
        //given
        String expectedCode = "SUCCESS";
        String expectedMessage = "요청이 성공했습니다.";
        String data = "테스트 데이터";

        //when
        ApiResponse<String> response = ApiResponse.of(ApiSuccessCode.SUCCESS, data);

        //then
        assertThat(response.code()).isEqualTo(expectedCode);
        assertThat(response.message()).isEqualTo(expectedMessage);
        assertThat(response.result()).isEqualTo(data);
    }

    @Test
    @DisplayName("데이터 미포함 응답 성공 테스트")
    public void resultNullTest() {
        //given
        String expectedCode = "SUCCESS";
        String expectedMessage = "요청이 성공했습니다.";

        //when
        ApiResponse<String> response = ApiResponse.of(ApiSuccessCode.SUCCESS);

        //then
        assertThat(response.code()).isEqualTo(expectedCode);
        assertThat(response.message()).isEqualTo(expectedMessage);
        assertThat(response.result()).isNull();
    }
}