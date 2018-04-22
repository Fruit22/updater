package ru.bmstu.updater.service;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import ru.bmstu.updater.dao.Settings;
import ru.bmstu.updater.repository.SettingRepository;
import ru.bmstu.updater.response_entities.SettingRs;
import ru.bmstu.updater.utils.MyXmlMerger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Service
public class DatabaseService {

    private final SettingRepository settingRepository;

    @Autowired
    public DatabaseService(SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }

    public String getSetting(long id) throws ParserConfigurationException, TransformerException, SAXException, IOException {
        SettingRs settingRs = new SettingRs();
        String setting = settingRepository.findOne(id).getData();
        String common = settingRepository.findOne(-1L).getData();
//        JSONObject jsonObject = new JSONObject(setting.getData());
//        return XML.toString(jsonObject);
        return MyXmlMerger.merge(setting, common);
//        return settingRs;
    }
}
