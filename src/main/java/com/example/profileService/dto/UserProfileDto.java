package com.example.profileService.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileDto {
    public Long id;
    public String name;
    public String email;
    public String bio;
    public String location;
    public Integer age;
    public Long externalUserId;
}
