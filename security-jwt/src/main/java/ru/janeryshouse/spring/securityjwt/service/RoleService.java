package ru.janeryshouse.spring.securityjwt.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.janeryshouse.spring.securityjwt.entites.Role;
import ru.janeryshouse.spring.securityjwt.repositories.RoleRepository;

@Service
@RequiredArgsConstructor
public class RoleService {

    private final RoleRepository roleRepository;

    public Role getUserRole() {
        return roleRepository.findByName("ROLE_USER").get();
    }
}
