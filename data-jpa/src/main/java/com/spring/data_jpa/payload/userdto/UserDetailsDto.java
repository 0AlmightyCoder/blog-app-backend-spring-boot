package com.spring.data_jpa.payload.userdto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDetailsDto {
    private String name;
    private String email;
    private String password;
}
