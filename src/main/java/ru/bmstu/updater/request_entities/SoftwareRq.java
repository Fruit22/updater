package ru.bmstu.updater.request_entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SoftwareRq {
    private long id;
    private String version;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
