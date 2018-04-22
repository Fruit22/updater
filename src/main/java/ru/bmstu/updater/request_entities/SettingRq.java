package ru.bmstu.updater.request_entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SettingRq {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
