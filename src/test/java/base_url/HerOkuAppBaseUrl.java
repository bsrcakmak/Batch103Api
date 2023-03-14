package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class HerOkuAppBaseUrl {

    protected RequestSpecification spec;  // RequestSpecification bir Interface'dir
    // (protected yaparsak package private gibi olur)
    // Sadece child classlarin ulasmasini istiyoruz

    @Before // Her test methodundan once calisir
    public void setUp(){
        spec = new RequestSpecBuilder().setBaseUri("https://restful-booker.herokuapp.com").build();
    }
    

}
