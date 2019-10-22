package com.libinbin.validation.rule;

import com.libinbin.validation.config.IValidRuleConfig;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
public class StringIsEmailValidRuleImpl extends AbstractStringValidRuleImpl {
    private static final Pattern EMAIL = Pattern.compile("^\\w+([-+.]\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*$");

    public StringIsEmailValidRuleImpl() {
    }

    public String errorMsg(IValidRuleConfig config) {
        return "不是电子邮箱格式(xxx.yyy@zzz.com)";
    }

    @Override
    protected boolean validString(String toValid, IValidRuleConfig config) {
        assert toValid != null;

        Matcher matcher = EMAIL.matcher(toValid);
        return matcher.find();
    }
}
