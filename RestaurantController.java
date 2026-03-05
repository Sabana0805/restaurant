package com.example.demo.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class RestaurantController {

    private static Map<Integer, Integer> tableCapacity = new HashMap<>() {{
        put(1, 10);
        put(2, 1);
        put(3, 15);
    }};

    @PostMapping("/reserve")
    public Map<String, Object> handleReservation(@RequestBody Map<String, Object> request) {
        try {
            int id = Integer.parseInt(request.get("restaurantId").toString());
            Integer current = tableCapacity.get(id);

            Map<String, Object> response = new HashMap<>();
            if (current != null && current > 0) {
                tableCapacity.put(id, current - 1);
                response.put("success", true);
                response.put("message", "Table Reserved Successfully!");
            } else {
                response.put("success", false);
                response.put("message", "Restaurant is currently FULL!");
            }
            return response;
        } catch (Exception e) {
            Map<String, Object> error = new HashMap<>();
            error.put("success", false);
            error.put("message", "Server Error: " + e.getMessage());
            return error;
        }
    }
}