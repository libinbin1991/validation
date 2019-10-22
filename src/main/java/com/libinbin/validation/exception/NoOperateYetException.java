package com.libinbin.validation.exception;

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
public class NoOperateYetException extends RuntimeException {
    private static final long serialVersionUID = 6150362528979953408L;

    public NoOperateYetException() {
        super("no operation happend yet! Please check if(IResult#isInit()) before calling IResult#getData().");
    }
}
