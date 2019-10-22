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
    IValidRuleConfig STRING_ALL_CHINESE = new ValidConfig("STRING_ALL_CHINESE");
    IValidRuleConfig STRING_IS_FLOAT = new ValidConfig("STRING_IS_FLOAT");
    IValidRuleConfig STRING_IS_INT = new ValidConfig("STRING_IS_INT");
    IValidRuleConfig STRING_MAX_LENGTH = new ValidConfig("STRING_MAX_LENGTH");
    IValidRuleConfig STRING_MIN_LENGTH = new ValidConfig("STRING_MIN_LENGTH");
    IValidRuleConfig STRING_NOT_BLANK = new ValidConfig("STRING_NOT_BLANK");
    IValidRuleConfig STRING_WITHOUT_CHINESE = new ValidConfig("STRING_WITHOUT_CHINESE");
    IValidRuleConfig STRING_PHONE_NUM = new ValidConfig("STRING_PHONE_NUM");
    IValidRuleConfig STRING_IDENTIFY_CARD = new ValidConfig("STRING_IDENTIFY_CARD");
    IValidRuleConfig STRING_IS_EMAIL = new ValidConfig("STRING_IS_EMAIL");
    IValidRuleConfig STRING_IS_DATE = new ValidConfig("STRING_IS_DATE");
    IValidRuleConfig STRING_ONLY_NUM = new ValidConfig("STRING_ONLY_NUM");
    IValidRuleConfig STRING_RIGHT_LENGTH = new ValidConfig("STRING_RIGHT_LENGTH");
    IValidRuleConfig STRING_IS_DOUBLE = new ValidConfig("STRING_IS_DOUBLE");
    IValidRuleConfig STRING_VALUE_RANGE = new ValidConfig("STRING_VALUE_RANGE");
    IValidRuleConfig STRING_MAX_VALUE = new ValidConfig("STRING_MAX_VALUE");
    IValidRuleConfig STRING_MIN_VALUE = new ValidConfig("STRING_MIN_VALUE");

    String ruleName();

    Object[] validParam();

}
