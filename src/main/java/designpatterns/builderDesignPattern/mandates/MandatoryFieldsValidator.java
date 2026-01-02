package designpatterns.builderDesignPattern.mandates;

import designpatterns.builderDesignPattern.UserAttributes.UserAttributes;
import designpatterns.builderDesignPattern.exceptions.MandatoryFieldsNotAvailableException;

import java.util.ArrayList;

public class MandatoryFieldsValidator {

    public static Boolean validate(ArrayList<UserAttributes>mandatoryFields){
        ArrayList<String> absentMandatoryFields = new ArrayList<>();
        for(UserAttributes mandatoryField: mandatoryFields){
            if(!mandatoryField.isValid()){
                absentMandatoryFields.add(mandatoryField.getAttributeType());
            }
        }

        if(absentMandatoryFields.isEmpty()) return true;

        throw new MandatoryFieldsNotAvailableException("Error While Initializing User Profile. Following Fields are Empty: " + absentMandatoryFields.toString());
    }
}
