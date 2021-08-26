class movie {
    String name;
    int partsCount;
    String director;

    movie() {
        this.name = null;
        this.partsCount = 0;
        this.director = null;
    }

    movie(String name, int partsCount, String director) {
        this.name = name;
        this.partsCount = partsCount;
        this.director = director;
    }

    String getName() {
        return this.name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getPartsCount() {
        return this.partsCount;
    }

    void setPartsCount(int partsCount) {
        this.partsCount = partsCount;
    }

    String getDirector() {
        return this.director;
    }

    void setDirector(String director) {
        this.director = director;
    }
}