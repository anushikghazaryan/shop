package org.example.shop.model;

//@Entity
public enum Role {
    ROLE_CUSTOMER("ROLE_CUSTOMER"),
    ROLE_VENDOR("ROLE_VENDOR");


    private String value;

    private Role(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
