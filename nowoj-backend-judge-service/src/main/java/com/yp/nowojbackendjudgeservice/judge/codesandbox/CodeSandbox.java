package com.yp.nowojbackendjudgeservice.judge.codesandbox;

import com.yp.nowojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.yp.nowojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * 代码沙箱接口定义
 */
public interface CodeSandbox {

    /**
     * 执行代码
     *
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
