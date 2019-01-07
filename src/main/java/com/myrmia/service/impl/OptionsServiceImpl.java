package com.myrmia.service.impl;

import com.myrmia.dao.OptionsDAO;
import com.myrmia.model.OptionsDO;
import com.myrmia.service.OptionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 网站信息业务逻辑实现类
 * Created by Ellery on 2018/12/4.
 */
@Service("optionsService")
public class OptionsServiceImpl implements OptionsService {

    private OptionsDAO optionsDAO;

    /**
     * 添加网站信息
     * @param optionsDO 网站信息
     */
    @Override
    public void saveOptions(OptionsDO optionsDO) {
        this.optionsDAO.addOptions(optionsDO);
    }

    /**
     * 由选项名称查询详细信息
     * @param optionsName 选项名称
     * @return 详细信息
     */
    @Override
    public OptionsDO queryOptionsByName(String optionsName) {
        return this.optionsDAO.queryOptionsByName(optionsName);
    }

    /**
     * 更新信息
     * @param optionsDO 信息
     */
    @Override
    public void modifyOptions(OptionsDO optionsDO) {
        this.optionsDAO.updateOptions(optionsDO);
    }

    /**
     * 删除信息
     * @param optionsDO 信息
     */
    @Override
    public void deleteOptions(OptionsDO optionsDO) {
        this.optionsDAO.deleteOptions(optionsDO);
    }

    @Autowired
    public void setOptionsDAO(OptionsDAO optionsDAO) {
        this.optionsDAO = optionsDAO;
    }
}
