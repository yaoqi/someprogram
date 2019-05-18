package daily;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by pfliu on 2019/05/16.
 */
public class GsonTest {


    public static void main(String[] args) {
        Gson gson = new Gson();
        JsonParser parser = new JsonParser();

        String i1 = "[\"wo\"]";

        JsonArray a = parser.parse(i1).getAsJsonArray();
        System.out.println(a.get(0).getAsString());



//        // 从json字符串拿到java对象并且拿到某些字段
//        String input = "{\"name\": \"huyanshi\", \"age\": 2}";
//        User user = gson.fromJson(input, User.class);
//        System.out.println(user.name);
//        System.out.println(user.age);
//
//        //从json字符串拿到json对象并且获取某些字段
//        JsonObject jo = parser.parse(input).getAsJsonObject();
//        System.out.println(jo.get("name").getAsString());
//        System.out.println(jo.get("age").getAsInt());
//
//        // 从json字符串解析json的list
//        //language=JSON
//        String i2 = "[{\"name\":\"huyanshi\",\"age\":\"12\"},{\"name\":\"huyanshi1\",\"age\":\"122\"}]";
//        List<User> users = gson.fromJson(i1, new TypeToken<List<User>>() {
//        }.getType());
//        System.out.println(users.toString());
//
//        //新建一个json对象并添加某些字段,之后输出字符串
//        JsonObject jo1 = new JsonObject();
//        jo1.addProperty("name", "huyanshi");
//        jo1.addProperty("age", "12");
//        System.out.println(jo1.toString());
//
//        // 将java对象或者数组转换为json字符串
//        String a1 = gson.toJson(user);
//        String a2 = gson.toJson(users);
//        System.out.println(a1);
//        System.out.println(a2);
//
//        //测试注解@SerializedName,
//        User u = new User();
//        u.name = "huyan";
//        u.age = 2;
//        System.out.println(gson.toJson(u));
    }


    private static class User {
        @SerializedName(value = "nn")
        String name;
        int age;

        @Override
        public String toString() {
            return "User{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
}
