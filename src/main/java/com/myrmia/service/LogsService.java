package com.myrmia.service;

import com.myrmia.model.LogsDO;

import java.util.List;

/**
 * logs service
 * Created by Ellery on 2019/1/11.
 */
public interface LogsService {

    /**
     * 添加日志
     * @param logsDO 日志信息
     */
    void addLogs(LogsDO logsDO);

    /**
     * 查询日志列表
     * @return 日志列表
     */
    List<LogsDO> queryLogs();

    /**
     * 更新日志
     * @param logsDO 日志信息
     */
    void modifyLogs(LogsDO logsDO);

    /**
     * 删除日志
     * @param logsDO 日志信息
     */
    void deleteLogs(LogsDO logsDO);

}
