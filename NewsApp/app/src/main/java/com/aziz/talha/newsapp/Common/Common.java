package com.aziz.talha.newsapp.Common;


import com.aziz.talha.newsapp.Interface.IconBetterIdeaService;
import com.aziz.talha.newsapp.Interface.NewsService;
import com.aziz.talha.newsapp.Remote.IconBetterIdeaClient;
import com.aziz.talha.newsapp.Remote.RetrofitClient;

/**
 * Created by Talha on 1.06.2018.
 */

public class Common {

    private static final String BASE_URL = "https://newsapi.org/";
    //yukarıdaki siteye uye olduktan sonra size api_key verecektir
    public static final String API_KEY = "490e29a364da406e8830d162360cb80b";

    public static NewsService getNewsService()
    {
        return RetrofitClient.getClient(BASE_URL).create(NewsService.class);
    }

    public static IconBetterIdeaService getIconService()
    {
        return IconBetterIdeaClient.getClient().create(IconBetterIdeaService.class);
    }

    public static String getAPIUrl(String source,String sortBy,String apiKEY)
    {
        StringBuilder apiUrl = new StringBuilder("https://newsapi.org/v2/top-headlines?sources=");
        return apiUrl.append(source)
                .append("&apiKey=")
                .append(apiKEY)
                .toString();
    }
}
