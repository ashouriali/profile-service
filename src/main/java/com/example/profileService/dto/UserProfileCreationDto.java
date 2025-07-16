package com.example.profileService.dto;

import com.example.profileService.common.exception.GeneralException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProfileCreationDto {
    public String email;
    public String bio;
    public String location;
    public Integer age;

    public void validate() throws GeneralException {
        if (email == null || email.isEmpty() || !EmailUtils.checkIfEmailIsValid(email))
            throw new GeneralException("email is invalid", HttpStatus.BAD_REQUEST);
        if (bio == null || bio.isEmpty()) throw new GeneralException("Bio is not valid!", HttpStatus.BAD_REQUEST);
        if (location == null || location.isEmpty())
            throw new GeneralException("Location is not valid!", HttpStatus.BAD_REQUEST);
        if (age == null || age > 150 || age < 0)
            throw new GeneralException("Name is not valid!", HttpStatus.BAD_REQUEST);
    }
}
