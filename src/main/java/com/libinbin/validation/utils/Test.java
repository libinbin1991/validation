package com.libinbin.validation.utils;

import com.libinbin.validation.config.IValidRuleConfigPlus;
import com.libinbin.validation.config.ValidConfig;
import com.libinbin.validation.field.ValidField;
import com.libinbin.validation.model.IResult;
import com.libinbin.validation.rule.SingletonValidFactory;
import com.libinbin.validation.rule.StringIsEmailValidRuleImpl;

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
public class Test {

    public static void main(String[] args) {

        SingletonValidFactory instance = SingletonValidFactory.getInstance();
        instance.registRule(IValidRuleConfigPlus.STRING_IS_EMAIL.ruleName(), new StringIsEmailValidRuleImpl());
        IResult<String> validResult = ValidUtil.valid(new ValidField("131123@123", "邮箱", IValidRuleConfigPlus.STRING_IS_EMAIL),
                new ValidField("", "收款方分支行名称", ValidConfig.OBJ_NOT_NULL));
        String message = validResult.getMessage();
        System.out.println(message);


    }
}
