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
public interface IValidRuleConfig {
    IValidRuleConfig OBJ_NOT_NULL = new ValidConfig("OBJ_NOT_NULL");

    String ruleName();

    Object[] validParam();

}
