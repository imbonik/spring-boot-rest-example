package ru.nfeoktistov.entity.request;

/**
 * Created by lat-fs on 6/3/2017.
 */
public class AddUserRequest {

    private String name;
    private String surname;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
