package com.example.customers.dto;

import lombok.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDto {
    private String nombre;
    private String direccion;
    private String telefono;
    private String contrasena;
    private boolean estado;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class AuthResponse {
        String token;
    }
}
