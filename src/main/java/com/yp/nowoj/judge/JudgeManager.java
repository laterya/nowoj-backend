package com.yp.nowoj.judge;

import com.yp.nowoj.judge.strategy.DefaultJudgeStrategy;
import com.yp.nowoj.judge.strategy.JavaLanguageJudgeStrategy;
import com.yp.nowoj.judge.strategy.JudgeContext;
import com.yp.nowoj.judge.strategy.JudgeStrategy;
import com.yp.nowoj.model.dto.questionsubmit.JudgeInfo;
import com.yp.nowoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
