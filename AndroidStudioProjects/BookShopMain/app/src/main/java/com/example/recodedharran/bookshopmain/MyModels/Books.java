package com.example.recodedharran.bookshopmain.MyModels;


public class Books {

String bookName;
String bookAuthor;
String pageCast;
int cover;
Boolean bestSeller;

    public Books(String bookName, String bookAuthor, String pageCast, int cover, Boolean bestSeller) {
        this.bookName = bookName;
        this.bookAuthor=bookAuthor;
        this.pageCast=pageCast;
        this.cover=cover;
        this.bestSeller=bestSeller;

    }

    public String getBookName() {
        return bookName;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public String getPageCast() {
        return pageCast;
    }

    public int getCover() {
        return cover;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public void setPageCast(String pageCast) {
        this.pageCast = pageCast;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public Boolean getBestSeller() {
        return bestSeller;
    }

    public void setBestSeller(Boolean bestSeller) {
        this.bestSeller = bestSeller;
    }
}

