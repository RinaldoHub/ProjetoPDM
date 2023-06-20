package pdm.rinaldo.projetopdm;

import android.content.Context;
import android.media.Image;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

import java.util.Date;

public class User {
    private String name, email, password;
    private Date birthDate;
    private Image profilePhoto;
//TODO adicionar atributo privado para salvar imagem do perfil (entender como salvar imagens)

    public User(Context context, String name, String email, String password, Date birthDate) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }

    public Image getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(Image profilePhoto) {
        this.profilePhoto = profilePhoto;
    }
}
