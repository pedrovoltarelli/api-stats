package com.example.api_stats.endpoint;

import java.time.LocalDateTime;

public class StatsEndpoint {
    public String status;
    public String version;
    public LocalDateTime localDateTime;

    public StatsEndpoint(String status, String version, LocalDateTime localDateTime) {
        this.status = status;
        this.version = version;
        this.localDateTime = localDateTime;
    }

    public String getStatus() {
        return status;
    }

    public String getVersion() {
        return version;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }
}
