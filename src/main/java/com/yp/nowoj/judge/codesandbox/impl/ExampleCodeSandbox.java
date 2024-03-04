package com.yp.nowoj.judge.codesandbox.impl;

import com.yp.nowoj.judge.codesandbox.CodeSandbox;
import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeRequest;
import com.yp.nowoj.judge.codesandbox.model.ExecuteCodeResponse;
import com.yp.nowoj.judge.codesandbox.model.JudgeInfo;
import com.yp.nowoj.model.enums.JudgeInfoMessageEnum;
import com.yp.nowoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;


/**
 * @ClassName: ExampleCodeSandbox
 * @Description: 示例沙箱代码(跑通流程)
 * @date: 2023/8/28
 * @author: yp
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}
