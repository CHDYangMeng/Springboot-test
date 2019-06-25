package com.jtkj.entity;

import java.util.Date;
import javax.persistence.*;

public class Exitetc2014 {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "entryStation")
    private String entrystation;

    @Column(name = "entryTime")
    private Date entrytime;

    @Column(name = "exitStation")
    private String exitstation;

    @Column(name = "exitTime")
    private Date exittime;

    private Integer total;

    private String car;

    private Double lat;

    private Double lng;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return entryStation
     */
    public String getEntrystation() {
        return entrystation;
    }

    /**
     * @param entrystation
     */
    public void setEntrystation(String entrystation) {
        this.entrystation = entrystation;
    }

    /**
     * @return entryTime
     */
    public Date getEntrytime() {
        return entrytime;
    }

    /**
     * @param entrytime
     */
    public void setEntrytime(Date entrytime) {
        this.entrytime = entrytime;
    }

    /**
     * @return exitStation
     */
    public String getExitstation() {
        return exitstation;
    }

    /**
     * @param exitstation
     */
    public void setExitstation(String exitstation) {
        this.exitstation = exitstation;
    }

    /**
     * @return exitTime
     */
    public Date getExittime() {
        return exittime;
    }

    /**
     * @param exittime
     */
    public void setExittime(Date exittime) {
        this.exittime = exittime;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
     * @return car
     */
    public String getCar() {
        return car;
    }

    /**
     * @param car
     */
    public void setCar(String car) {
        this.car = car;
    }

    /**
     * @return lat
     */
    public Double getLat() {
        return lat;
    }

    /**
     * @param lat
     */
    public void setLat(Double lat) {
        this.lat = lat;
    }

    /**
     * @return lng
     */
    public Double getLng() {
        return lng;
    }

    /**
     * @param lng
     */
    public void setLng(Double lng) {
        this.lng = lng;
    }
}