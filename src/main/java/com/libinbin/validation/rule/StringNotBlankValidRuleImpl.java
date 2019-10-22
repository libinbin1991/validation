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
public class StringNotBlankValidRuleImpl extends AbstractStringValidRuleImpl {

    StringNotBlankValidRuleImpl() {
    }

    @Override
    public boolean validString(String toValid, IValidRuleConfig config) {
        return toValid.trim().length() != 0;
    }

    public String errorMsg(IValidRuleConfig config) {
        return "不能为空字符串";
    }
}
