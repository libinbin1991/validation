package com.libinbin.validation.rule;

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
public abstract class AbstractStringValidRuleImpl implements IValidRule {
    public AbstractStringValidRuleImpl() {
    }

    public final boolean valid(Object toValid, IValidRuleConfig config) {
        String validStr = null;
        if (toValid != null) {
            assert toValid instanceof String;

            validStr = (String) toValid;
        } else {
            validStr = "";
        }

        return this.validString(validStr, config);
    }

    protected abstract boolean validString(String var1, IValidRuleConfig var2);


}
