package ru.itis.inf403;

public enum Gender {
    Женский(1),
    Мужской(2);

    private int  code;

    private Gender(int code) {
        this.code = code;
    }

    static Gender findByCode(int code) {
        if (code == 1) {
            return Gender.Женский;
        } else {
            return Gender.Мужской;
        }
    }
}
