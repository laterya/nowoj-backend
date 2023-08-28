package com.yp.nowoj.judge.codesandbox.impl;

import com.yp.nowoj.judge.codesandbox.CodeSandbox;
import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @ClassName: ThirdPartyCodeSandbox
 * @Description: 三方代码沙箱
 * @date: 2023/8/28
 * @author: yp
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("三方代码沙箱执行代码");
        return null;
    }
}
