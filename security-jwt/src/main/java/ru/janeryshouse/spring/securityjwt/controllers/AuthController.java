package ru.janeryshouse.spring.securityjwt.controllers;


import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import ru.janeryshouse.spring.securityjwt.dto.JwtRequest;
import ru.janeryshouse.spring.securityjwt.dto.RegistrationUserDto;
import ru.janeryshouse.spring.securityjwt.service.AuthService;


@RestController
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;



    @PostMapping("/auth")
    public ResponseEntity<?> createAuthToken(@RequestBody JwtRequest authRequest) {
        return authService.createAuthToken(authRequest);
    }

    @PostMapping("/registration")
    public ResponseEntity<?> createNewUser(@RequestBody RegistrationUserDto registrationUserDto) {
        return authService.createNewUser(registrationUserDto);


    }
}
