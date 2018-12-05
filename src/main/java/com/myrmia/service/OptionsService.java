package com.myrmia.service;

import com.myrmia.model.OptionsDO;

/**
 * 网站信息业务逻辑接口
 * Created by Ellery on 2018/12/4.
 */
public interface OptionsService {

    /**
     * 添加网站信息
     * @param optionsDO 网站信息
     */
    void saveOptions(OptionsDO optionsDO);


    /**
     * 由选项名称查询详细信息
     * @param optionsName 选项名称
     * @return 详细信息
     */
    OptionsDO queryOptionsByName(String optionsName);
}
