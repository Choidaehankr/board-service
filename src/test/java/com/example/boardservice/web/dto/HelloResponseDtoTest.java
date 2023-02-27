package com.example.boardservice.web.dto;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class HelloResponseDtoTest {

    @Test
    @DisplayName("Lombok 기능 테스트")
    void lombokTest() {
        String name = "test";
        int amount = 1000;

        HelloResponseDto dto = new HelloResponseDto(name, amount);

        assertThat(dto.getAmount()).isEqualTo(amount);
        assertThat(dto.getName()).isEqualTo(name);
    }
}