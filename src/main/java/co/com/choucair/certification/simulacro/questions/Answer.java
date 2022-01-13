package co.com.choucair.certification.simulacro.questions;

import co.com.choucair.certification.simulacro.model.UserData;
import co.com.choucair.certification.simulacro.userinterface.CompletePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question) {
        this.question = question;
    }

    public static Answer toThe(String msgFinal) {
        return new Answer(msgFinal);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String msgFinal = Text.of(CompletePage.MESSAGE_FINAL).viewedBy(actor).asString();

        if(question.equals(msgFinal)){
            result = true;
        }else{
            result = false;
        }

        return result;
    }
}
