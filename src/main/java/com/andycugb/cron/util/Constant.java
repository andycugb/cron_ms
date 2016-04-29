package com.andycugb.cron.util;

import org.apache.log4j.Logger;

/**
 * Created by jbcheng on 2016-03-16.
 */
public final class Constant {
    public static final Logger LOG_CRON = Logger.getLogger("cron.log");
    public static final String CRON_DO_IP = "0.0.0.0";// 可以执行的ip
    public static final String CRON_LIMIT_IP = "1.1.1.1";// 禁止执行的ip
}
