package ru.bmstu.updater.response_entities;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class SettingRs {
    private String settingOne;
    private String settingTwo;
    private String settingThree;

    public String getSettingOne() {
        return settingOne;
    }

    public void setSettingOne(String settingOne) {
        this.settingOne = settingOne;
    }

    public String getSettingTwo() {
        return settingTwo;
    }

    public void setSettingTwo(String settingTwo) {
        this.settingTwo = settingTwo;
    }

    public String getSettingThree() {
        return settingThree;
    }

    public void setSettingThree(String settingThree) {
        this.settingThree = settingThree;
    }
}
