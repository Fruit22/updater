package ru.bmstu.updater.response_entities;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SettingRs {
    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

}
