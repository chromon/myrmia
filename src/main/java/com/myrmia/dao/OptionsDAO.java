package com.myrmia.dao;

import com.myrmia.model.OptionsDO;

/**
 * 网站信息数据访问对象
 * Created by Ellery on 2018/12/4.
 */
public interface OptionsDAO {

    /**
     * 添加网站信息
     * @param optionsDO 网站信息
     */
    void addOptions(OptionsDO optionsDO);
}
