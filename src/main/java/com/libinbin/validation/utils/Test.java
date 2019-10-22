package com.libinbin.validation.utils;

import com.libinbin.validation.config.ValidConfig;
import com.libinbin.validation.field.ValidField;
import com.libinbin.validation.model.IResult;

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
        IResult<String> validResult = ValidUtil.valid(
                new ValidField("123456", "收款方账户名称", ValidConfig.OBJ_NOT_NULL),
                new ValidField("123435", "收款方账户名称", ValidConfig.OBJ_NOT_NULL),
                new ValidField("", "收款方分支行名称", ValidConfig.OBJ_NOT_NULL)
        );
        String message = validResult.getMessage();
        System.out.println(message);

    }
}
