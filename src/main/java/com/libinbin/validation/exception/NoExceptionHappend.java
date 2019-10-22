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
public class NoExceptionHappend extends RuntimeException {
    private static final long serialVersionUID = 8104240820545517699L;

    public NoExceptionHappend() {
        super("No Exception Happend! Please check if(IResult#isSuccess()) before calling IResult#getException().");
    }
}
