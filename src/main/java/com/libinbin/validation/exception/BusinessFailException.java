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
public class BusinessFailException extends RuntimeException {
    private static final long serialVersionUID = 3474665749379649448L;

    public BusinessFailException(String message) {
        super(message);
    }
}
