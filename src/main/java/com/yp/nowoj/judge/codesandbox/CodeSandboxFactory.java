package com.yp.nowoj.judge.codesandbox;

import com.yp.nowoj.judge.codesandbox.impl.ExampleCodeSandbox;
import com.yp.nowoj.judge.codesandbox.impl.RemoteCodeSandbox;
import com.yp.nowoj.judge.codesandbox.impl.ThirdPartyCodeSandbox;

/**
 * @ClassName: CodeSandboxFactory
 * @Description: 代码沙箱工厂类
 * @date: 2023/8/28
 * @author: yp
 */
public class CodeSandboxFactory {

    public static CodeSandbox newInstance(String type) {
        switch (type) {
            case "remote":
                return new RemoteCodeSandbox();
            case "thirdParty":
                return new ThirdPartyCodeSandbox();
            case "example":
            default:
                return new ExampleCodeSandbox();

        }
    }
}
