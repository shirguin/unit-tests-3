package seminars.third.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserRepositoryTest {

    @Test
    void logOutAll() {
        UserRepository repository = new UserRepository();
        User user1 = new User("test1", "123", false);
        User user2 = new User("test2", "456", false);
        User user3 = new User("test3", "789", true);

        repository.addUser(user1);
        repository.addUser(user2);
        repository.addUser(user3);

        repository.logOutAll();
        int lenData = repository.data.size();
        assertEquals(1, lenData);




    }
}