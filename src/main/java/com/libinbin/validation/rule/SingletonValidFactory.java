package com.libinbin.validation.rule;

import com.libinbin.validation.config.IValidRuleConfig;
import com.libinbin.validation.config.ValidConfig;

import java.util.Hashtable;
import java.util.Map;

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
public class SingletonValidFactory implements IValidFactory{
    private static final Map<String, IValidRule> ruleMap = new Hashtable();
    static final SingletonValidFactory FACTORY = new SingletonValidFactory();

    private SingletonValidFactory() {
        ruleMap.put(ValidConfig.OBJ_NOT_NULL.ruleName(), new StringNotBlankValidRuleImpl());
    }

    public IValidRule buildRule(IValidRuleConfig config) {
        assert config != null;

        IValidRule rule = (IValidRule)ruleMap.get(config.ruleName());

        assert rule != null;

        return rule;
    }

    public void registRule(String ruleName, IValidRule rule) {
        assert ruleName != null;

        assert rule != null;

        ruleMap.put(ruleName, rule);
    }
}
