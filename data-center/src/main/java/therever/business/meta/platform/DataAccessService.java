package therever.business.meta.platform;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import org.springframework.stereotype.Component;


@Component
public class DataAccessService {

    private MongoClient mongoClient;

    private MongoDatabase mongoDatabase;


    public MongoDatabase getMongoDatabase() {
        return mongoDatabase;
    }
}
