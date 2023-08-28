package com.yp.nowoj.judge.strategy;

import com.yp.nowoj.model.dto.question.JudgeCase;
import com.yp.nowoj.model.dto.questionsubmit.JudgeInfo;
import com.yp.nowoj.model.entity.Question;
import com.yp.nowoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * @ClassName: JudgeContext
 * @Description:
 * @date: 2023/8/28
 * @author: yp
 */
@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;
}
