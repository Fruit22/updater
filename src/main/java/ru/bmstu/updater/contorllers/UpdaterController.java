package ru.bmstu.updater.contorllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import ru.bmstu.updater.repository.SettingRepository;
import ru.bmstu.updater.request_entities.SettingRq;
import ru.bmstu.updater.response_entities.SettingRs;
import ru.bmstu.updater.service.DatabaseService;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.io.StringReader;

@RestController
public class UpdaterController {

    private final DatabaseService databaseService;

    @Autowired
    public UpdaterController(SettingRepository settingRepository, DatabaseService databaseService) {
        this.databaseService = databaseService;
    }


    @RequestMapping("/")
    public String testSsl(@RequestBody(required = false) String request) throws ParserConfigurationException, IOException, SAXException, TransformerException {
        SettingRq settingRq = new SettingRq();

        try {
            JAXBContext context = JAXBContext.newInstance(SettingRq.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            settingRq = (SettingRq) unmarshaller.unmarshal(new StringReader(request));
        } catch (Exception e) {
            System.out.println("oops");
        }

        if (settingRq == null) return null;

        return databaseService.getSetting(settingRq.getId());
    }
}
