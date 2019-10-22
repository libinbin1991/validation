package com.libinbin.validation.model.impl;

import com.libinbin.validation.exception.BusinessFailException;
import com.libinbin.validation.exception.NoExceptionHappend;
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
public class ResultImpl<T> implements IResult<T> {
    private static final long serialVersionUID = 1L;
    protected static final NoOperateYetException NO_OPERATE_YET = new NoOperateYetException();
    protected static final NoExceptionHappend NO_EXCEPTION = new NoExceptionHappend();
    protected ResultStatusEnum status;
    protected String message;
    protected T data;
    protected Exception exception;

    ResultImpl() {
        this.status = ResultStatusEnum.INIT;
        this.message = ResultStatusEnum.INIT.name();
        this.data = null;
        this.exception = NO_OPERATE_YET;
    }

    public ResultStatusEnum getStatus() {
        return this.status;
    }

    public final String getMessage() {
        return this.message;
    }

    public T getData() throws NoOperateYetException, BusinessFailException {
        if (ResultStatusEnum.INIT.equals(this.status)) {
            throw new NoOperateYetException();
        } else {
            return this.data;
        }
    }

    public final Exception getException() {
        return this.exception;
    }

    public boolean isSuccess() {
        return ResultStatusEnum.SUCCESS.equals(this.getStatus());
    }

    public boolean isInit() {
        return ResultStatusEnum.INIT.equals(this.getStatus());
    }

    public boolean isFail() {
        return ResultStatusEnum.FAIL.equals(this.getStatus());
    }

    public boolean isException() {
        return ResultStatusEnum.EXCEPTION.equals(this.getStatus());
    }

    public void success(T data) throws NullPointerException {
        this.setData(data);
        this.setStatus(ResultStatusEnum.SUCCESS);
        this.setMessage(ResultStatusEnum.SUCCESS.name());
        this.setException(NO_EXCEPTION);
    }

    public void fail(T data, String message) throws NullPointerException {
        String messageTemp = message == null ? ResultStatusEnum.FAIL.name() : message;
        this.setData(data);
        this.setStatus(ResultStatusEnum.FAIL);
        this.setMessage(messageTemp);
        this.setException(new BusinessFailException(messageTemp));
    }

    public void exception(T data, String message, Exception e) throws NullPointerException {
        this.setData(data);
        this.setStatus(ResultStatusEnum.EXCEPTION);
        this.setMessage(message == null ? e.getMessage() : message);
        this.setException(e);
    }

    protected void setStatus(ResultStatusEnum status) {
        this.status = status;
    }

    protected void setMessage(String message) {
        this.message = message;
    }

    void setData(T data) throws NullPointerException {
        if (data == null) {
            throw new NullPointerException("the data of IResult can not be NULL!");
        } else {
            this.data = data;
        }
    }

    protected void setException(Exception e) throws NullPointerException {
        if (e == null) {
            throw new NullPointerException("the Excption of IResult can not be NULL when it's status is EXCEPTION!");
        } else {
            this.exception = e;
        }
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("ResultImpl [");
        if (this.getStatus() != null) {
            builder.append("getStatus()=");
            builder.append(this.getStatus());
            builder.append(", ");
        }

        if (this.getMessage() != null) {
            builder.append("getMessage()=");
            builder.append(this.getMessage());
            builder.append(", ");
        }

        if (this.isException()) {
            builder.append("getException()=");
            builder.append(this.getException());
            builder.append(", ");
        }

        if (!this.isInit()) {
            builder.append("getData()=");

            try {
                builder.append(this.getData());
            } catch (Exception var3) {
            }

            builder.append(", ");
        }

        builder.append("]");
        return builder.toString();
    }

    public void fail(String message) throws NullPointerException {
        String messageTemp = message == null ? ResultStatusEnum.FAIL.name() : message;
        this.setStatus(ResultStatusEnum.FAIL);
        this.setMessage(messageTemp);
        this.setException(new BusinessFailException(messageTemp));
    }

    public void exception(String message, Exception e) throws NullPointerException {
        this.setStatus(ResultStatusEnum.EXCEPTION);
        this.setMessage(message == null ? e.getMessage() : message);
        this.setException(e);
    }
}
