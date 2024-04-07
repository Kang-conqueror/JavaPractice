import javax.swing.text.Document;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {

        WeatherOfDay weather = new WeatherOfDay();

        //final String url = "http://www.weather.com.cn/weather/101010100.shtml";

        //Document webSite = Jsoup.connect(url).method

        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
         final String Info = "<li class=\"sky skyid lv1 on\">" +
                "<h1>7日（今天）</h1>" +
                "<big class=\"png40 d00\"></big>" +
                "<big class=\"png40 n01\"></big>" +
                "<p title=\"晴转多云\" class=\"wea\">晴转多云</p>" +
                "<p class=\"tem\">" +
                "<span>28</span>/<i>11℃</i>" +
                "</p>" +
                "<p class=\"win\">" +
                "<em>" +
                "<span title=\"西南风\" class=\"SW\"></span>" +
                "<span title=\"东风\" class=\"E\"></span>" +
                "</em>" +
                "<i>&lt;3级</i>" +
                "</p>" +
                "<div class=\"slid\"></div>" +
                "</li>";



        final String dayReg = "<li class=\"sky.*?" +
                "<p.*?class=\"wea\">(.+?)</p>" + 	// 分组1：天气情况
                "<p.*?<span>(.+?)</span>.*?" + 	// 分组2：最高气温
                "<i>(.+?)</i>.*?" + 		// 分组3：最低气温
                "<span title=\"(.+?)\".*?" + 	// 分组4：风向1
                "<span title=\"(.+?)\".*?" + 	// 分组5：风向2
                "<i>(.+?)</i>.*?" + 		// 分组6：风力
                "</li>";


        Pattern pattern = Pattern.compile(dayReg);
        Matcher matcher = pattern.matcher(Info);
        matcher.find();

        weather.info = matcher.group(1);
        weather.maxTemp = Integer.parseInt(matcher.group(2));
        weather.minTemp = Integer.parseInt(matcher.group(3).substring(0, matcher.group(3).length() - 2));
        weather.windDirection = matcher.group(4) + " " + matcher.group(5);
        weather.windForce = Integer.parseInt(matcher.group(6).substring(4, matcher.group(6).length() - 1));

        weather.printValue();

    }
}