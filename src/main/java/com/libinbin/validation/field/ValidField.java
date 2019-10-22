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
public class ValidField implements IValidField  {
    private final Object value;
    private final String name;
    private final IValidRuleConfig[] configs;

    public ValidField(Object v, String n, IValidRuleConfig... c) {
        assert c != null;

        assert n != null;

        this.value = v;
        this.name = n;
        this.configs = c;
    }

    public Object value() {
        return this.value;
    }

    public String name() {
        return this.name;
    }

    public IValidRuleConfig[] configs() {
        return this.configs;
    }
}
