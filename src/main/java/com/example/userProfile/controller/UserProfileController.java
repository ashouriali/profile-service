package com.example.userProfile.controller;

import com.example.userProfile.dto.UserProfileCreationDto;
import com.example.userProfile.dto.UserProfileDto;
import com.example.userProfile.service.UserProfileService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gw/v1/profiles")
@RequiredArgsConstructor
public class UserProfileController {
    private final UserProfileService userProfileService;

    @PostMapping
    public Long createUserProfile(@RequestBody UserProfileCreationDto userProfileCreationDto) {
        return userProfileService.createUserProfile(userProfileCreationDto);
    }

    @GetMapping("/{id}")
    public UserProfileDto getUserProfile(@PathVariable Long id) {
        return userProfileService.getUserProfileById(id);
    }
}
