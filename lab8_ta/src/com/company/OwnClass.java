package com.company;


import java.util.Objects;

public class OwnClass implements Comparable<OwnClass> {
    int city;
    private String street_addr;
    private int phone;

    public OwnClass(int city, String street_addr, int phone) {
        this.city = city;
        this.street_addr = street_addr;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OwnClass ownClass = (OwnClass) o;

        return city == ownClass.city && phone == ownClass.phone && street_addr.equals(ownClass.street_addr);
    }

    @Override
    public int hashCode() {
        int hash = city;

        hash = 31*hash;

        if( street_addr != null){
            hash += stringHash(street_addr);
        }

        hash += phone;

        return hash;
    }

    public int stringHash(String str){
        int hash = 7;
        for (int i = 0; i < str.length(); i++) {
            hash = hash*31 + str.charAt(i);
        }

        return hash;
    }


    @Override
    public int compareTo(OwnClass ownClass) {
        if(city == ownClass.city){
            if(street_addr.compareTo(ownClass.street_addr) == 0){
                if(phone == ownClass.phone){
                    return 0;
                }
                return Integer.compare(phone, ownClass.phone);
            }
            return street_addr.compareTo(ownClass.street_addr);
        }
        return Integer.compare(city, ownClass.city);
    }
}
