package com.libinbin.validation.config;


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
public class ValidConfig implements IValidRuleConfig {

    private final String ruleName;
    private final Object[] validParam;

    public ValidConfig(String name) {
        this.ruleName = name;
        this.validParam = null;
    }

    public ValidConfig(String name, Object... params) {
        this.ruleName = name;
        this.validParam = params;
    }

    public String ruleName() {
        return this.ruleName;
    }

    public Object[] validParam() {
        return this.validParam;
    }
}
