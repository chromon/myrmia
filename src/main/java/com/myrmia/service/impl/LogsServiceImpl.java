package com.myrmia.service.impl;

import com.myrmia.dao.LogsDAO;
import com.myrmia.model.LogsDO;
import com.myrmia.service.LogsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * logs service impl
 * Created by Ellery on 2019/1/11.
 */
@Service("logsService")
public class LogsServiceImpl implements LogsService {

    private LogsDAO logsDAO;

    /**
     * 添加日志
     * @param logsDO 日志信息
     */
    @Override
    public void addLogs(LogsDO logsDO) {
        this.logsDAO.addLogs(logsDO);
    }

    /**
     * 查询日志列表
     * @return 日志列表
     */
    @Override
    public List<LogsDO> queryLogs() {
        return this.logsDAO.queryLogs();
    }

    /**
     * 更新日志
     * @param logsDO 日志信息
     */
    @Override
    public void modifyLogs(LogsDO logsDO) {
        this.logsDAO.updateLogs(logsDO);
    }

    /**
     * 删除日志
     * @param logsDO 日志信息
     */
    @Override
    public void deleteLogs(LogsDO logsDO) {
        this.logsDAO.deleteLogs(logsDO);
    }

    @Autowired
    public void setLogsDAO(LogsDAO logsDAO) {
        this.logsDAO = logsDAO;
    }
}
