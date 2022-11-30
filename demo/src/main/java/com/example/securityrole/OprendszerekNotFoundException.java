package com.example.securityrole;

class OprendszerekNotFoundException extends RuntimeException {
    OprendszerekNotFoundException(Long id) {
        super("A szoftver nem található: " +id);
    }
}