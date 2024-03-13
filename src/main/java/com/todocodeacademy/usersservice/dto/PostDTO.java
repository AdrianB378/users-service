package com.todocodeacademy.usersservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class PostDTO {

    private Long id;
    private String title;
    private Long user_id;
}
// aca vamos a recibir a Post, es exactamente igual (transferencia de datos)
