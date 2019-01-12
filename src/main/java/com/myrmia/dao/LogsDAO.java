package com.myrmia.dao;

import com.myrmia.model.LogsDO;

/**
 * logs dao
 * Created by Ellery on 2019/1/11.
 */
public interface LogsDAO {

    /**
     * 添加日志
     * @param logsDO 日志信息
     */
    void addLogs(LogsDO logsDO);

    /**
     * 更新日志
     * @param logsDO 日志信息
     */
    void updateLogs(LogsDO logsDO);

    /**
     * 删除日志
     * @param logsDO 日志信息
     */
    void deleteLogs(LogsDO logsDO);
}
