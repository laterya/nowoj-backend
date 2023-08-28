package com.yp.nowoj.judge.strategy;

import com.yp.nowoj.model.dto.questionsubmit.JudgeInfo;

/**
 * @ClassName: JudgeStrategy
 * @Description:
 * @date: 2023/8/28
 * @author: yp
 */
public interface JudgeStrategy {
    JudgeInfo doJudge(JudgeContext judgeContext);
}
