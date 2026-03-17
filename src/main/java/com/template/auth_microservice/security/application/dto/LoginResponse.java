package com.template.auth_microservice.security.application.dto;

public record LoginResponse(Token accessToken, Token refreshToken) {
}
