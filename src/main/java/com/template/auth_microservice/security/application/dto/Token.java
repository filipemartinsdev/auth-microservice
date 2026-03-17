package com.template.auth_microservice.security.application.dto;

import jakarta.persistence.Transient;

import java.time.Instant;

public record Token (String token, Instant expiration) {
}
