package com.yp.nowojbackendjudgeservice.judge.codesandbox.impl;

import com.yp.nowojbackendjudgeservice.judge.codesandbox.CodeSandbox;
import com.yp.nowojbackendmodel.codesandbox.ExecuteCodeRequest;
import com.yp.nowojbackendmodel.codesandbox.ExecuteCodeResponse;

/**
 * 第三方代码沙箱（调用网上现成的代码沙箱）
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
