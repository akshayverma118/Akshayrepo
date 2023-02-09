package Basetest;

import Configclass.ConfigClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.baseURI;

import java.io.IOException;
import java.util.Map;

public class BaseClass {
    @BeforeClass
    public void setBaseUrl() throws IOException {
        baseURI=  getConfigProperties("baseUrl");
    }

    @BeforeMethod
    public void setBasePath() throws IOException {
        basePath=getConfigProperties("basePath");
    }

    public String getConfigProperties(String key) throws IOException {
        Map<Object,Object> map= ConfigClass.setProperties();
        return map.get(key).toString();

    }
}
