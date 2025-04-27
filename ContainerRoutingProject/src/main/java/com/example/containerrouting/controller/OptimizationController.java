package com.example.containerrouting.controller;

import com.example.containerrouting.service.OptimizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/optimize")
public class OptimizationController {

    private final OptimizationService optimizationService;

    @Autowired
    public OptimizationController(OptimizationService optimizationService) {
        this.optimizationService = optimizationService;
    }

    @PostMapping
    public ResponseEntity<List<String>> optimize(@RequestBody Map<String, Object> inputData) {
        List<String> plan = optimizationService.optimize(inputData);
        return ResponseEntity.ok(plan);
    }
}
