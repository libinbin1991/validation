package com.libinbin.validation.field;

import com.libinbin.validation.config.IValidRuleConfig;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2016</p>
 *
 * @author lbb
 * @version 1.0
 * 修改记录：
 * 修改序号，修改日期，修改人，修改内容
 */
public interface IValidField {
    Object value();

    String name();

    IValidRuleConfig[] configs();
}
