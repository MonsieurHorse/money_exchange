package controller;


import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pay")
public class Controller {

    @RequestMapping(value = "/getRate", method = RequestMethod.POST)
    public JSONObject getRate(@RequestBody JSONObject jsonObject) {
        System.out.println("get rate");

        JSONObject jsonObject2 = new JSONObject();

        jsonObject2.put("hello", "world");
        jsonObject2.put("name", 1);

        return jsonObject2;
    }

    @RequestMapping(value = "/h", method = RequestMethod.GET)
    @ResponseBody
    public String recordInquiry() {

        System.out.println(" get method");
        return "helllo";
    }

}
