package com.yp.nowoj.judge.codesandbox.impl;

import com.yp.nowoj.judge.codesandbox.CodeSandbox;
import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeResponse;

/**
 * @ClassName: RemoteCodeSandbox
 * @Description: 远程代码沙箱
 * @date: 2023/8/28
 * @author: yp
 */
public class RemoteCodeSandbox implements CodeSandbox {

    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("远程代码沙箱执行代码");
        return null;
    }
}
