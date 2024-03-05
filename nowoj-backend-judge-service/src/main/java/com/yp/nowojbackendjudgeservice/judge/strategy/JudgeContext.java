package com.yp.nowojbackendjudgeservice.judge.strategy;

import com.yp.nowojbackendmodel.codesandbox.JudgeInfo;
import com.yp.nowojbackendmodel.dto.question.JudgeCase;
import com.yp.nowojbackendmodel.entity.Question;
import com.yp.nowojbackendmodel.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文（用于定义在策略中传递的参数）
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
