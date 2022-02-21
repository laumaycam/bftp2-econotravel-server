package com.econotravel.api.controllers;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code  = HttpStatus.NOT_FOUND, reason = "Experience not found")
public class ExperienceNotFoundException extends RuntimeException{
}
