package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {
    // バリデーションを実行する
    public static List<String> validate(Task m) {
        List<String> errors = new ArrayList<String>();

        String title_error = _validateTitle(m.gettitle());
        if(!title_error.equals("")) {
            errors.add(title_error);
        }

        String content_error = _validateContent(m.getContent());
        if(!content_error.equals("")) {
            errors.add(content_error);
        }

        return errors;
    }

    // 担当の必須入力チェック
    private static String _validateTitle(String title) {
        if(title == null || title.equals("")) {
            return "担当を入力してください。";
        }

        return "";
    }

    // タスク内容の必須入力チェック
    private static String _validateContent(String content) {
        if(content == null || content.equals("")) {
            return "タスク内容を入力してください。";
        }

        return "";
    }
}