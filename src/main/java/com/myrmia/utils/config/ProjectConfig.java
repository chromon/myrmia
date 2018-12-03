package com.myrmia.utils.config;

/**
 * project config
 * Created by Ellery on 2018/12/3.
 */
public class ProjectConfig {

    public static final String CLASSPATH = Thread.currentThread()
            .getContextClassLoader().getResource("").getPath().substring(1).replace("/", java.io.File.separator);;

    public static final boolean OPTION_ALLOW_INSTALL = false;
}
