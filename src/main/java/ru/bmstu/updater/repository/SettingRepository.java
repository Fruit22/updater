package ru.bmstu.updater.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.bmstu.updater.dao.Settings;

@Repository
public interface SettingRepository extends CrudRepository<Settings, Long> {
}
