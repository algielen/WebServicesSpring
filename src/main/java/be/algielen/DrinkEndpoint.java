package be.algielen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class DrinkEndpoint {

    private static final String NAMESPACE_URI = "http://algielen.be";

    private DrinkRepository drinkRepository;

    @Autowired
    public DrinkEndpoint(DrinkRepository drinkRepository) {
        this.drinkRepository = drinkRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "getDrinkRequest")
    @ResponsePayload
    public GetDrinkResponse getDrink(@RequestPayload GetDrinkRequest request) {
        GetDrinkResponse response = new GetDrinkResponse();
        response.setDrink(drinkRepository.findDrink(request.getUniqueName()));
        return response;
    }
}
