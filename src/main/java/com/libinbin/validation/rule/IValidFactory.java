package com.libinbin.validation.rule;

import com.libinbin.validation.config.IValidRuleConfig;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2016</p>
 * <p>Company: Sunshine Insurance Group Co., Ltd.</p>
 *
 * @author lbb
 * @version 1.0
 * 修改记录：
 * 修改序号，修改日期，修改人，修改内容
 */
public interface IValidFactory {
    IValidFactory SINGLETON_FACTORY = SingletonValidFactory.FACTORY;

    IValidRule buildRule(IValidRuleConfig var1);

    void registRule(String var1, IValidRule var2);
}
