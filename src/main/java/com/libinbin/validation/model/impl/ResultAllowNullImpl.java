package com.libinbin.validation.model.impl;

import com.libinbin.validation.exception.BusinessFailException;
import com.libinbin.validation.exception.NoOperateYetException;
import com.libinbin.validation.model.IResult;
import com.libinbin.validation.model.ResultStatusEnum;

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
public class ResultAllowNullImpl<T> extends ResultImpl<T> implements IResult<T> {
    private static final long serialVersionUID = -7131267431762407925L;

    ResultAllowNullImpl() {
    }

    @Override
    void setData(T data) {
        this.data = data;
    }

    @Override
    public final T getData() throws NoOperateYetException, BusinessFailException, RuntimeException {
        if (ResultStatusEnum.SUCCESS.equals(this.status)) {
            return this.data;
        } else if (ResultStatusEnum.INIT.equals(this.status)) {
            throw new NoOperateYetException();
        } else if (ResultStatusEnum.EXCEPTION.equals(this.status)) {
            throw new RuntimeException(this.exception);
        } else if (ResultStatusEnum.FAIL.equals(this.status)) {
            throw new BusinessFailException(this.message);
        } else {
            return this.data;
        }
    }

}
