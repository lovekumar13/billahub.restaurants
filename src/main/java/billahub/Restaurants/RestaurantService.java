package billahub.Restaurants;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RestaurantService {
    @Autowired
    private RestaurantRepository restaurantRepository;
    public List<Restaurants> getAllRestaurants()
    {
        try {

            return restaurantRepository.findAll();
        }
        catch (Exception ex)
        {

        }
        return restaurantRepository.findAll();
    }
    public Optional<Restaurants> getRestaurantById(ObjectId id)
    {
        return restaurantRepository.findById(id);
    }

    public Optional<List<Restaurants>> getRestaurantByZip(String zipcode) {
        return restaurantRepository.findRestaurantByzipcode(zipcode);
    }
}
