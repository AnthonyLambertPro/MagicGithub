package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public abstract class FakeApiServiceGenerator {


    static List<User> generateUsers() {
        return new ArrayList<>(FAKE_USERS_NEW);
    }

    public static List<User> FAKE_USERS = Arrays.asList(
            new User("001", "Jake", "https://api.adorable.io/AVATARS/512/1.png"),
            new User("003", "Phil", "https://api.adorable.io/AVATARS/512/3.png"),
            new User("004", "Guillaume", "https://api.adorable.io/AVATARS/512/4.png"),
            new User("005", "Francis", "https://api.adorable.io/AVATARS/512/5.png"),
            new User("006", "George", "https://api.adorable.io/AVATARS/512/6.png"),
            new User("007", "Louis", "https://api.adorable.io/AVATARS/512/7.png"),
            new User("008", "Mateo", "https://api.adorable.io/AVATARS/512/8.png"),
            new User("009", "April", "https://api.adorable.io/AVATARS/512/9.png"),
            new User("010", "Louise", "https://api.adorable.io/AVATARS/512/10.png"),
            new User("011", "Elodie", "https://api.adorable.io/AVATARS/512/11.png"),
            new User("012", "Helene", "https://api.adorable.io/AVATARS/512/12.png"),
            new User("013", "Fanny", "https://api.adorable.io/AVATARS/512/13.png"),
            new User("014", "Laura", "https://api.adorable.io/AVATARS/512/14.png"),
            new User("015", "Gertrude", "https://api.adorable.io/AVATARS/512/15.png"),
            new User("016", "Chloé", "https://api.adorable.io/AVATARS/512/16.png"),
            new User("017", "April", "https://api.adorable.io/AVATARS/512/17.png"),
            new User("018", "Marie", "https://api.adorable.io/AVATARS/512/18.png"),
            new User("019", "Henri", "https://api.adorable.io/AVATARS/512/19.png"),
            new User("020", "Rémi", "https://api.adorable.io/AVATARS/512/20.png")
    );

    public static List<User> FAKE_USERS_RANDOM = Arrays.asList(
            new User("021", "Lea", "https://api.adorable.io/AVATARS/512/21.png"),
            new User("022", "Geoffrey", "https://api.adorable.io/AVATARS/512/22.png"),
            new User("023", "Simon", "https://api.adorable.io/AVATARS/512/23.png"),
            new User("024", "André", "https://api.adorable.io/AVATARS/512/24.png"),
            new User("025", "Leopold", "https://api.adorable.io/AVATARS/512/25.png")
    );

    public static List<User> FAKE_USERS_NEW = Arrays.asList(
            new User("001", "Jake", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("002", "Paul", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("003", "Phil", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("004", "Guillaume", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("005", "Francis", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("006", "George", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("007", "Louis", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("008", "Mateo", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("009", "April", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("010", "Louise", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("011", "Elodie", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("012", "Helene", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("013", "Fanny", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("014", "Laura", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("015", "Gertrude", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("016", "Chloé", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("017", "April", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("018", "Marie", "https://www.womenwithdroids.com/wp-content/uploads/2011/03/droidette-logo-purpleFINAL.png"),
            new User("019", "Henri", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg"),
            new User("020", "Rémi", "https://images-na.ssl-images-amazon.com/images/I/41-vNRXUHCL._AC_SY355_.jpg")
    );

    public static List<User> FAKE_USERS_RANDOM_NEW = Arrays.asList(
            new User("021", "Lea", "https://pbs.twimg.com/profile_images/1739585900/androidgirl_400x400.png"),
            new User("022", "Geoffrey", "https://www.kindpng.com/picc/m/119-1199611_hot-girl-png-text-android-logo-hd-transparent.png"),
            new User("023", "Simon", "https://image.flaticon.com/icons/png/512/61/61120.png"),
            new User("024", "André", "https://img1.freepng.fr/20180602/pyb/kisspng-computer-icons-android-icon-android-5b12edf2b3af08.185175261527967218736.jpg"),
            new User("025", "Leopold", "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR4vs8RIvpEw56sSlz9KJoW0mc4WACjomvliA&usqp=CAU")
    );
}
