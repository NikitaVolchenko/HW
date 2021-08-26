class book {
    String name;
    int pageCount;
    int yearOfRelease;
    String author;

    book() {
        this.name = null;
        this.pageCount = 0;
        this.yearOfRelease = 0;
        this.author = null;
    }

    book(String name, int pageCount, int yearOfRelease, String author) {
        this.name = name;
        this.pageCount = pageCount;
        this.yearOfRelease = yearOfRelease;
        this.author = author;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getPageCount() {
        return this.pageCount;
    }

    void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    int getYearOfRelease() {
        return this.yearOfRelease;
    }

    void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    String getAuthor() {
        return this.author;
    }

    void setAuthor(String author) {
        this.author = author;
    }
}