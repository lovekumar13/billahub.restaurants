package billahub.Restaurants;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface RestaurantRepository extends MongoRepository<Restaurants, ObjectId> {

    Optional<List<Restaurants>> findRestaurantByzipcode(String zipcode);
}
