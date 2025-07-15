package com.example.userProfile.controller;

import com.example.userProfile.common.exception.GeneralException;
import com.example.userProfile.dto.ResponseDto;
import com.example.userProfile.dto.UserProfileCreationDto;
import com.example.userProfile.dto.UserProfileDto;
import com.example.userProfile.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gw/v1/profiles")
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping
    public ResponseDto<Long> createUserProfile(
            @RequestBody UserProfileCreationDto userProfileCreationDto
    ) throws GeneralException {
        if (userProfileCreationDto == null)
            throw new GeneralException("user creation dto is null!", HttpStatus.BAD_REQUEST);
        userProfileCreationDto.validate();
        return ResponseDto.of(userProfileService.createUserProfile(userProfileCreationDto));
    }

    @GetMapping("/{id}")
    public ResponseDto<UserProfileDto> getUserProfile(@PathVariable Long id) throws GeneralException {
        return ResponseDto.of(userProfileService.getUserProfileById(id));
    }
}
