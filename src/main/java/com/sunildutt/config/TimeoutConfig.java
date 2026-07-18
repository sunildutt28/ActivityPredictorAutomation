package com.sunildutt.config;

public class TimeoutConfig {

    private int implicit;
    private int explicit;

    public int getImplicit() {
        return implicit;
    }

    public int getExplicit() {
        return explicit;
    }

    public void setImplicit(int implicit) {
        this.implicit = implicit;
    }

    public void setExplicit(int explicit) {
        this.explicit = explicit;
    }
}