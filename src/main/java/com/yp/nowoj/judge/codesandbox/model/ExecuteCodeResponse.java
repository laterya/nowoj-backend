package com.yp.nowoj.judge.codesandbox.model;

import com.yp.nowoj.model.dto.questionsubmit.JudgeInfo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @ClassName: ExecuteCodeResponse
 * @Description: 调用代码沙箱的返回
 * @date: 2023/8/28
 * @author: yp
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ExecuteCodeResponse {
    private List<String> outputList;

    /**
     * 接口信息
     */
    private String message;

    /**
     * 执行状态
     */
    private Integer status;

    /**
     * 判题信息
     */
    private JudgeInfo judgeInfo;
}
