package com.sinaukoding.perpustakaan.controller;


import org.springframework.security.access.prepost.PreAuthorize;

//@PreAuthorize("isFullyAuthenticated()")
@PreAuthorize("permitAll()")
public abstract class BaseController {

}