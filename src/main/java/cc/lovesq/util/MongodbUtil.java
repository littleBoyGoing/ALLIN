package cc.lovesq.util;

import cc.lovesq.repository.MongoRepository;
import com.mongodb.Mongo;
import org.springframework.data.authentication.UserCredentials;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * @Description mongodb实例获取
 * @Date 2021/5/20 10:30 下午
 * @Created by qinshu
 */
public class MongodbUtil {

    private static MongoRepository repository;

    public static MongoRepository getInstance() {
        if (repository == null) {
            repository = new MongoRepository(
                    new MongoTemplate(new Mongo(), "detect", new UserCredentials("test", "test")));
        }
        return repository;
    }

}
