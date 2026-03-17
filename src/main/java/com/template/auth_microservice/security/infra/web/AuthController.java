package com.template.auth_microservice.security.infra.web;

import com.template.auth_microservice.common.dto.StandardResponse;
import com.template.auth_microservice.security.application.dto.*;
import com.template.auth_microservice.security.application.service.AuthService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
public class AuthController {
    private AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<StandardResponse<LoginResponse>> login(@Valid @RequestBody LoginRequest request) {
        return ResponseEntity.ok(
                StandardResponse.success(
                        authService.login(request)
                )
        );
    }

    @PostMapping("/refresh")
    public ResponseEntity<StandardResponse<LoginResponse>> register(@Valid @RequestBody RefreshRequest request) {
        return ResponseEntity.ok(
                StandardResponse.success(
                        authService.refresh(request)
                )
        );
    }
}
