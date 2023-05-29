import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class SILab2Test {
     private List<User> createList(User...users){
         return new ArrayList<>(Arrays.asList(users));
     }
     @Test //Every-Branch
     void Test1 () {
         RuntimeException ex;
         ex=Assertions.assertThrows(RuntimeException.class,()->SILab2.function(null,null));
         Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
         Assertions.assertEquals(true,SILab2.function(new User("Matea","Ma12345!@#","matea@gmail.com"),createList(new User("Leo","le12345!@#","leo@gmail.com"))));
         Assertions.assertEquals(false,SILab2.function(new User(null,"Ma11","leo@gmail.com"),createList(new User("Leo","le12345!@#","leo@gmail.com"))));
         Assertions.assertEquals(false,SILab2.function(new User("Leo","Ma12 345!@#","matea@gmail.com"),createList(new User("Leo","le12345!@#","leo@gmail.com"))));
         Assertions.assertEquals(false,SILab2.function(new User("Matea","Ma12345678","mateagmailcom"),createList(new User("Leo","le12345!@#","leo@gmail.com"))));
     }
     @Test //Multiple-Condition
     void Test2(){
         RuntimeException ex;
         ex=Assertions.assertThrows(RuntimeException.class,()->SILab2.function(null,null));
         Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
         ex=Assertions.assertThrows(RuntimeException.class,()->SILab2.function(new User("Matea",null,"matea@gmail.com"),null));
         Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
         ex=Assertions.assertThrows(RuntimeException.class,()->SILab2.function(new User("Matea","Ma12345!@#",null),null));
         Assertions.assertTrue(ex.getMessage().contains("Mandatory information missing!"));
         Assertions.assertEquals(true,SILab2.function(new User("Matea","Ma12345!@#","matea@gmail.com"),createList(new User("Leo","le12345!@#","leo@gmail.com"))));

     }
}
