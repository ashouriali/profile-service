package com.example.userProfile.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileCreationDto {
    public String email;
    public String bio;
    public String location;
    public Integer age;
}
