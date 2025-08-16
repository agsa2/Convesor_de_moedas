package models;

import java.util.Map;

public record Conversao(String base_code, Map<String, Double> conversion_rates) {
}