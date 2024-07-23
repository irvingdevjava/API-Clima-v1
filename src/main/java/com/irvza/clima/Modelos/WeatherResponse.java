package com.irvza.clima.Modelos;

import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

    @JsonProperty("location")
    private Location location;

    @JsonProperty("current")
    private Current current;

    // Getters 
    public Location getLocation() {
        return location;
    }

    public Current getCurrent() {
        return current;
    }


    public static class Location {
        @JsonProperty("name")
        private String name;

        @JsonProperty("region")
        private String region;

        @JsonProperty("country")
        private String country;

        @JsonProperty("lat")
        private float latitude;

        @JsonProperty("lon")
        private float longitude;

        @JsonProperty("localtime")
        private String localtime;

        // Getters
        public String getName() {
            return name;
        }

        public String getRegion() {
            return region;
        }

        public String getCountry() {
            return country;
        }

        public float getLatitude() {
            return latitude;
        }

        public float getLongitude() {
            return longitude;
        }

        public String getLocaltime() {
            return localtime;
        }
    }

    public static class Current {
        @JsonProperty("temp_c")
        private float tempC;

        @JsonProperty("temp_f")
        private float tempF;

        @JsonProperty("condition")
        private Condition condition;

        @JsonProperty("humidity")
        private int humidity;

        @JsonProperty("wind_kph")
        private float windKph;

        // @JsonProperty("wind_mph")
        // private float windMph;

        // @JsonProperty("pressure_mb")
        // private float pressureMb;

        // @JsonProperty("pressure_in")
        // private float pressureIn;

        // @JsonProperty("feelslike_c")
        // private float feelsLikeC;

        // @JsonProperty("feelslike_f")
        // private float feelsLikeF;

        // @JsonProperty("precip_mm")
        // private float precipMm;

        // @JsonProperty("precip_in")
        // private float precipIn;

        @JsonProperty("vis_km")
        private float visibilityKm;

        // @JsonProperty("vis_miles")
        // private float visibilityMiles;

        // Getters y setters
        public float getTempC() {
            return tempC;
        }

        public float getTempF() {
            return tempF;
        }

        public Condition getCondition() {
            return condition;
        }

        public int getHumidity() {
            return humidity;
        }

        public float getWindKph() {
            return windKph;
        }

        // public float getWindMph() {
        //     return windMph;
        // }

        // public float getPressureMb() {
        //     return pressureMb;
        // }

        // public float getPressureIn() {
        //     return pressureIn;
        // }

        // public float getFeelsLikeC() {
        //     return feelsLikeC;
        // }

        // public float getFeelsLikeF() {
        //     return feelsLikeF;
        // }

        // public float getPrecipMm() {
        //     return precipMm;
        // }

        // public float getPrecipIn() {
        //     return precipIn;
        // }

        public float getVisibilityKm() {
            return visibilityKm;
        }


        // public float getVisibilityMiles() {
        //     return visibilityMiles;
        // }


        public static class Condition {
            @JsonProperty("text")
            private String text;

            @JsonProperty("icon")
            private String icon;

            // Getters y setters
            public String getText() {
                return text;
            }

            

            public String getIcon() {
                return icon;
            }

            
        }
    }
}
