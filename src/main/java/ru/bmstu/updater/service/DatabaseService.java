package ru.bmstu.updater.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.bmstu.updater.dao.SettingDao;
import ru.bmstu.updater.repository.SettingRepository;
import ru.bmstu.updater.response_entities.SettingRs;

@Service
public class DatabaseService {

    private final SettingRepository settingRepository;

    @Autowired
    public DatabaseService(SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }

    public SettingRs getSetting(long id) {
        SettingRs settingRs = new SettingRs();
        SettingDao setting = settingRepository.findOne(id);
        settingRs.setSettingOne(setting.getSettingOne());
        settingRs.setSettingTwo(setting.getSettingTwo());
        settingRs.setSettingThree(setting.getSettingThree());
        return settingRs;
    }
}
