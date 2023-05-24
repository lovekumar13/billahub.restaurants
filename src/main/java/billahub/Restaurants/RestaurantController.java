package billahub.Restaurants;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {
    @Autowired
    private RestaurantService restaurantService;
    @GetMapping
    public ResponseEntity<List<Restaurants>> getAllRestaurants()
    {
        return new ResponseEntity<List<Restaurants>>(restaurantService.getAllRestaurants(),HttpStatus.OK );
    }
    @GetMapping("/{zipcode}")
    public ResponseEntity<Optional<List<Restaurants>>> getRestaurantByZip(@PathVariable String zipcode)
    {

        return new ResponseEntity<Optional<List<Restaurants>>>(restaurantService.getRestaurantByZip(zipcode),HttpStatus.OK);
    }
}
