package Huseyin.Abstract;

public abstract class Insan {
    private String name;
    private String surname;

    public abstract void calis();
    public void bilgilendirme(){
        System.out.println("Bilgilendirme Insan klasının metodu");

    }
    public void isimDegistir () {
        System.out.println("İsim değişikliği insan klasında");

    }

    public Insan(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Insan() {
    }

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
