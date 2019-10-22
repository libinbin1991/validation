package com.libinbin.validation.model.impl;

import com.libinbin.validation.model.IResult;

import java.util.List;

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
public final class ResultFactory {
    public ResultFactory() {
    }

    public static final <T> IResult<T> INIT(T data) throws NullPointerException {
        assert data != null;

        ResultImpl<T> result = new ResultImpl();
        result.setData(data);
        return result;
    }

    public static final <T> IResult<T> INITSUCCESS(T data) throws NullPointerException {
        assert data != null;

        ResultImpl<T> result = new ResultImpl();
        result.success(data);
        return result;
    }

    public static final <T> IResult<List<T>> INIT(List<T> data) throws NullPointerException {
        assert data != null;

        ResultImpl<List<T>> result = new ResultImpl();
        result.setData(data);
        return result;
    }

    public static final <T> IResult<List<T>> INITSUCCESS(List<T> data) throws NullPointerException {
        assert data != null;

        ResultImpl<List<T>> result = new ResultImpl();
        result.success(data);
        return result;
    }

    public static final <T> IResult<T> INIT() throws NullPointerException {
        ResultImpl<T> result = new ResultAllowNullImpl();
        return result;
    }
}
