package com.ivoyant.securitydemo.dto;

import java.util.List;

public class LoginResponse {
        private String token;
        private String type = "Bearer";

        public LoginResponse(String token, String jwt, List<String> roles) {
            this.token = token;
        }

        // Getters & Setters
        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

