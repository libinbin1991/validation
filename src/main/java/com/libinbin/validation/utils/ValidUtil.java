package com.libinbin.validation.utils;

import com.libinbin.validation.config.IValidRuleConfig;
import com.libinbin.validation.field.IValidField;
import com.libinbin.validation.model.IResult;
import com.libinbin.validation.model.impl.ResultFactory;
import com.libinbin.validation.rule.IValidFactory;
import com.libinbin.validation.rule.IValidRule;
import com.libinbin.validation.rule.SingletonValidFactory;

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
public class ValidUtil {

    private static final String SUCCESS = "校验通过";

    public ValidUtil() {
    }

    private static final String valid(Object toValid, IValidRuleConfig... ruleConfigList) {
        assert ruleConfigList != null;
        SingletonValidFactory factory = SingletonValidFactory.getInstance();

        for (int configIndex = 0; configIndex < ruleConfigList.length; ++configIndex) {
            IValidRuleConfig config = ruleConfigList[configIndex];
            IValidRule rule = factory.buildRule(config);
            assert rule != null;
            if (!rule.valid(toValid, config)) {
                return rule.errorMsg(config);
            }
        }

        return SUCCESS;
    }

    public static final IResult<String> valid(IValidField... fields) {
        assert fields != null;
        IResult<String> result = ResultFactory.INIT();
        String fieldResult = null;
        IValidField[] var6 = fields;
        int var5 = fields.length;

        for (int var4 = 0; var4 < var5; ++var4) {
            IValidField field = var6[var4];
            fieldResult = valid(field.value(), field.configs());
            if (!SUCCESS.equals(fieldResult)) {
                result.fail(field.name() + fieldResult);
                break;
            }
        }

        return result;
    }

}
