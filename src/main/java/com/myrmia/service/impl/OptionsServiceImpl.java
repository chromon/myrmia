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

    @Autowired
    public void setOptionsDAO(OptionsDAO optionsDAO) {
        this.optionsDAO = optionsDAO;
    }
}
