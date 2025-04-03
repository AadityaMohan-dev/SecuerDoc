package com.aaditya.securedoc.repository;

import com.aaditya.securedoc.entity.CredentialEntity;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface CredentialRepository {
    Optional<CredentialEntity> getCredentialByUseEntityId(Long userId);
}
