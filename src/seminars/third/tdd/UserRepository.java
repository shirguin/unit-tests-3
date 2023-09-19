package seminars.third.tdd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class UserRepository {

    // Тут можно хранить аутентифицированных пользователей
    List<User> data = new ArrayList<>();

    public void addUser(User user) {
       this.data.add(user);
    }

    public boolean findByName(String username) {
        for (User user : data) {
            if (user.name.equals(username)) {
                return true;
            }
        }
        return false;
    }

    public void logOutAll(){
        if(!this.data.isEmpty()) {
            for (User user : data) {
                if (!user.isAdmin) {

                    /** Запутался в методах массивов Java, не получилось нормально удалить элементы из массива*/
                    //user.isAuthenticate = false;

                    //this.data.remove(user);

                    //user = null;
                }
            }

 //           this.data.removeAll(Arrays.asList(null));

        }

//        for(User user:data){
//            System.out.println(user.name);
//            System.out.println(user.isAuthenticate);
//            System.out.println(user.isAdmin);

 //       System.out.println(this.data);

    }

}