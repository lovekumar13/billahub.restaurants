package billahub.Restaurants;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Field;

//
@Document(collection="restaurants")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Restaurants {
    @Id
    private ObjectId id;
    private String name;
    private double rating;
    private String photoName;
    private String website;
    private String address;
    private Integer zipcode;
    private String price;
    private String category;
    private String photoUrl;
}
