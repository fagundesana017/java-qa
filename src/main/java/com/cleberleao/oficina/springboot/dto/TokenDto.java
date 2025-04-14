package com.cleberleao.oficina.springboot.dto;

import lombok.*;
/**
 * @author CleberLeão
 */
@Data
@NoArgsConstructor
public class TokenDto {
    private String token;
    private String tipo;
    private String roles;

    public TokenDto(String token, String bearer, String roles) {
        this.token = token;
        this.tipo = bearer;
        this.roles = roles;
    }
}
