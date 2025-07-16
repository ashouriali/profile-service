package com.example.profileService.model;

import com.example.profileService.dto.UserProfileCreationDto;
import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "user_profile")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Nonnull
    @Column(unique = true, nullable = false)
    private String email;

    @Column(columnDefinition = "TEXT")
    private String bio;

    @Column
    private Integer age;

    @Column
    private String location;

    @Column
    private Long externalUserId;

    public static UserProfileEntity of(UserProfileCreationDto userProfileCreationDto, Long externalUserId) {
        return UserProfileEntity.builder()
                .email(userProfileCreationDto.email)
                .bio(userProfileCreationDto.bio)
                .location(userProfileCreationDto.location)
                .age(userProfileCreationDto.age)
                .externalUserId(externalUserId)
                .build();
    }
}
