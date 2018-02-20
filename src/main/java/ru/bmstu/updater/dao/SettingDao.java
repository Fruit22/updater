package ru.bmstu.updater.dao;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by fruit on 16.12.2017.
 */
@Entity
public class SettingDao {

    @Id
    private long id;
    private String settingOne;
    private String settingTwo;
    private String settingThree;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

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
