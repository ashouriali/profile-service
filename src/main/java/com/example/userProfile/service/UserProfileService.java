package com.example.userProfile.service;

import com.example.userProfile.dto.UserProfileCreationDto;
import com.example.userProfile.dto.UserProfileDto;
import com.example.userProfile.model.UserProfileEntity;
import com.example.userProfile.repository.UserProfileRepository;
import com.example.userProfile.soap.userService.UserResponse;
import com.example.userProfile.soap.userService.UserSoapService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;
    private final UserSoapService userSoapService;


    @Transactional
    public Long createUserProfile(UserProfileCreationDto userProfileCreationDto) {
        UserResponse user = null;

        try {
            user = userSoapService.getUserByEmail(userProfileCreationDto.email);
        } catch (Exception e) {

        }

        UserProfileEntity userProfile = UserProfileEntity.of(userProfileCreationDto, user.getId());
        return userProfileRepository.save(userProfile).getId();
    }


    @Transactional(readOnly = true)
    public UserProfileDto getUserProfileById(Long id) {
        UserProfileEntity userProfile = userProfileRepository.findById(id).orElseThrow();
        UserResponse user = null;
        try {
            user = userSoapService.getUserById(userProfile.getExternalUserId());
        } catch (Exception e) {

        }

        return UserProfileDto.builder()
                .id(userProfile.getId())
                .age(userProfile.getAge())
                .location(userProfile.getLocation())
                .email(userProfile.getEmail())
                .bio(userProfile.getBio())
                .name(user.getName())
                .externalUserId(userProfile.getExternalUserId())
                .build();

    }
}
