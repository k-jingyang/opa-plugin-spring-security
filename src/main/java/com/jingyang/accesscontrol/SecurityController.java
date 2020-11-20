package com.jingyang.accesscontrol;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

    @GetMapping("/api/v1/resource/{id}")
    public ResponseEntity<String> getPokemon(@PathVariable Long id) {
        return ResponseEntity.ok( "Accessed general information about resource with id: " + id);
    }

}
