package com.itlxl.domain;

public class Book {
    private String 书名;
    private Double 价格;

    public String get书名() {
        return 书名;
    }

    public void set书名(String 书名) {
        this.书名 = 书名;
    }

    public Double get价格() {
        return 价格;
    }

    public void set价格(Double 价格) {
        this.价格 = 价格;
    }

    @Override
    public String toString() {
        return "Book{" +
                "书名='" + 书名 + '\'' +
                ", 价格=" + 价格 +
                '}';
    }
}
