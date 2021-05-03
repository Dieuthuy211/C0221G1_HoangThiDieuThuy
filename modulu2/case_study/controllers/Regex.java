package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static final String FULL_NAME = "[A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+(([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ][a-zàáâãèéêìíòóôõùúăđĩũơưăạảấầẩẫậắằẳẵặẹẻẽềềểễệỉịọỏốồổỗộớờởỡợụủứừửữựỳỵỷỹ]+)|([ ][A-ZẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ]))+";
    private static final String EMAIL = "^[A-Za-z0-9]{6,}@[a-z]{3,4}.[a-z]{2,3}$";
    private static final String DATE_OF_BIRTH = "^([0-2][0-9]|30|31)[/]([0][1-9]|11|12)[/](19[0-9][1-9]|200[0-3])$";
    private static final String GENDER = "^Male|Female$";
    private static final String IDENTITYCARD="^[0-9]{9}$";
    public boolean checkIdentityCard(String identityCard){
        return Pattern.matches(IDENTITYCARD,identityCard);
    }
    public boolean checkGender(String gender){
        return Pattern.matches(GENDER,gender);
    }

    public boolean checkDataOfBirth(String dataOfBirht) {
        return Pattern.matches(DATE_OF_BIRTH, dataOfBirht);
    }

    public boolean checkEmail(String email) {
        return Pattern.matches(EMAIL, email);
    }

    public boolean checkFullNam(String fullname) {
        return Pattern.matches(FULL_NAME, fullname);
    }

    public boolean checkIDVilA(String id) {
        String regexid = "^SVVL[0-9]{4}$";
        Pattern pattern = Pattern.compile(regexid);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    public boolean checkIDHouse(String id) {
        String regexID = "^SVHO[0-9]{4}$";
//        Pattern pattern=Pattern.compile(regexID);
//        Matcher matcher=pattern.matcher(id);
        return Pattern.matches(regexID, id);
    }

    public boolean checkIDRoom(String id) {
        String regexId = "^SVRO[0-9]{4}$";
        Pattern pattern = Pattern.compile(regexId);
        Matcher matcher = pattern.matcher(id);
        return matcher.matches();
    }

    //tên dịch vụ
    public boolean checkNameService(String nameService) {
        String regexNameSevice = "^[A-Z]{1}[a-z]";
        Pattern pattern = Pattern.compile(regexNameSevice);
        Matcher matcher = pattern.matcher(nameService);
        return matcher.matches();
    }

    //diện tích
    public boolean checkArea(String Area) {
        String regetPoolArea = "^[3-9][0-9]|[1-9][0-9]{2,}$";
        Pattern pattern = Pattern.compile(regetPoolArea);
        Matcher matcher = pattern.matcher(Area);
        return matcher.matches();
    }

    //người tối đa
    public boolean checkMaximumPeople(String maximumPeople) {
        String regexMaximumPeople = "^[1-9]|[1][0-9]|[20]{2}$";
        Pattern pattern = Pattern.compile(regexMaximumPeople);
        Matcher matcher = pattern.matcher(maximumPeople);
        return matcher.matches();
    }

    //chi phí thuê
    public boolean checkRentalCosts(String rentalCosts) {
        String regexRentalCosts = "[1-9]{1,}";
        Pattern pattern = Pattern.compile(regexRentalCosts);
        Matcher matcher = pattern.matcher(rentalCosts);
        return matcher.matches();
    }

    //số tầng
    public boolean checkNumberFloor(String numberFloor) {
        String regexNumberFloor = "[1-9]";
        Pattern pattern = Pattern.compile(regexNumberFloor);
        Matcher matcher = pattern.matcher(numberFloor);
        return matcher.matches();

    }
//    public boolean checkRentalTypeVilla(){
//        String regex="";
//    }


}
