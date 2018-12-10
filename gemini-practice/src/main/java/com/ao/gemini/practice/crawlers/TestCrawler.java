package com.ao.gemini.practice.crawlers;

public class TestCrawler {
    public static void main(String[] args) {
        Html html = new Html();
        //html.getHtmlTextByPath("2","http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2015/index.html");
        html.getProvince("2","http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/2015/index.html","provincetr");
//        System.out.println(1);
    }
}
