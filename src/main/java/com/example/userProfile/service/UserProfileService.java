package com.example.userProfile.service;

import com.example.userProfile.common.exception.GeneralException;
import com.example.userProfile.common.logging.GeneralLogger;
import com.example.userProfile.dto.UserProfileCreationDto;
import com.example.userProfile.dto.UserProfileDto;
import com.example.userProfile.model.UserProfileEntity;
import com.example.userProfile.repository.UserProfileRepository;
import com.example.userProfile.soap.userService.UserResponse;
import com.example.userProfile.soap.userService.UserSoapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserProfileService {
    private final UserProfileRepository userProfileRepository;
    private final UserSoapService userSoapService;
    private GeneralLogger logger = new GeneralLogger(UserProfileService.class);


    @Transactional
    public Long createUserProfile(UserProfileCreationDto userProfileCreationDto) throws GeneralException {
        UserResponse user = null;
        try {
            user = userSoapService.getUserByEmail(userProfileCreationDto.email);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }
        if(user.getId() == null) throw new GeneralException("User id is null!", HttpStatus.INTERNAL_SERVER_ERROR);
        UserProfileEntity userProfile = UserProfileEntity.of(userProfileCreationDto, user.getId());
        return userProfileRepository.save(userProfile).getId();
    }


    @Transactional(readOnly = true)
    public UserProfileDto getUserProfileById(Long id) throws GeneralException {
        UserProfileEntity userProfile = userProfileRepository.findById(id).orElseThrow(() ->
                new GeneralException("User profile not found!", HttpStatus.NOT_FOUND)
        );
        UserResponse user = null;
        try {
            user = userSoapService.getUserById(userProfile.getExternalUserId());
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
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
