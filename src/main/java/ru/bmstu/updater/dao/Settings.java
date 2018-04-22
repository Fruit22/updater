package ru.bmstu.updater.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fruit on 16.12.2017.
 */
@Entity
public class Settings {

    @Id
    private long id;
    private String data;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
