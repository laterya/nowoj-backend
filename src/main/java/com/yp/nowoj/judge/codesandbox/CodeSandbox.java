package com.yp.nowoj.judge.codesandbox;

import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @ClassName: CodeSandbox
 * @Description: 代码沙箱接口定义
 * @date: 2023/8/28
 * @author: yp
 */
public interface CodeSandbox {

    /**
     * 执行代码
     * @param executeCodeRequest
     * @return ExecuteCodeResponse
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
