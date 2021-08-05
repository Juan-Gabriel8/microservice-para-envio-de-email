package com.microservice.email.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservice.email.model.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
