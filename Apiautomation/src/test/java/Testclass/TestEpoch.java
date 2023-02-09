package Testclass;

import APIutility.ApiService;
import Basetest.BaseClass;
import Constants.ConstantsClass;
import io.restassured.http.Header;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class TestEpoch extends BaseClass {
    @Test
    public void TestEpochtime() throws IOException {
        Header h = new Header(ConstantsClass.KEY_VALUE_FOR_COOKIE,getConfigProperties(ConstantsClass.KEY_VALUE_FOR_COOKIE));
        LinkedHashMap<String,Object> map= ApiService.buildQueryParams(ConstantsClass.KEY_VALUE_FOR_CACHE,getConfigProperties(ConstantsClass.KEY_VALUE_FOR_CACHE),new LinkedHashMap<>());
        ApiService.buildQueryParams(ConstantsClass.KEY_VALUE_FOR_CACHED,getConfigProperties(ConstantsClass.KEY_VALUE_FOR_CACHED), map);
        Response response= ApiService.getResponseForGetApi(map,h);
        System.out.println(response.getStatusCode());
        System.out.println("Human Readable format ----------->" + response.asString());
        Assert.assertEquals(response.statusCode(),200);
    }
}
