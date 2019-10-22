package com.libinbin.validation.model;

import com.libinbin.validation.exception.BusinessFailException;
import com.libinbin.validation.exception.NoOperateYetException;

import java.io.Serializable;

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
public interface IResult<T> extends Serializable {
    String getMessage();

    T getData() throws NoOperateYetException, BusinessFailException;

    Exception getException();

    ResultStatusEnum getStatus();

    boolean isInit();

    boolean isSuccess();

    void success(T var1) throws NullPointerException;

    boolean isFail();

    void fail(T var1, String var2) throws NullPointerException;

    boolean isException();

    void exception(T var1, String var2, Exception var3) throws NullPointerException;

    void fail(String var1) throws NullPointerException;

    void exception(String var1, Exception var2) throws NullPointerException;
}
