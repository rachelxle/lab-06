package com.example.listycity;

/**
 * This is a class that defines a City
 * */

public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * Constructs a City object
     * @param city the name of the city
     * @param province the name of the province
     */
    City (String city, String province) {
        this.city = city;
        this.province = province;
    }

    /**
     * Returns the city name
     * @return the city name
     */
    String getCityName() {
        return this.city;
    }

    /**
     * Returns the province name
     * @return the province name
     */
    String getProvinceName() {
        return this.province;
    }

    /**
     * Compares the cities alphabetically by city name
     * @param o the other city to compare to
     * @return comparison result based on city name
     */
    @Override
    public int compareTo(City o) {
        return this.city.compareTo(o.getCityName());
    }

    /**
     * Two City objects are equal if both their city and province match
     * @param obj   the reference object with which to compare.
     * @return trye if equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof City)) return false;
        City other = (City) obj;
        return this.city.equals(other.city) && this.province.equals(other.province);
    }

    /**
     * Hash code consistent with equals
     * @return hash code
     */
    @Override
    public int hashCode() {
        return (city + province).hashCode();
    }

}
