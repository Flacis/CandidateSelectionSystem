public class Candidate implements Comparable<Candidate> {
    String name;
    String age;
    String sex;
    Integer relevance;
    Integer rating;

    public Candidate(String name, String age, String sex, Integer relevance, Integer rating) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.relevance = relevance;
        this.rating = rating;

    }

    String getName() {
        return name;
    }

    String getAge() {
        return age;
    }

    String getSex() {
        return sex;
    }

    Integer getRelevance() {
        return relevance;
    }

    Integer getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("%-30s %13d %19d", getName(), getRelevance(), getRating());
    }

    @Override
    public int compareTo(Candidate candidate) {
        return name.compareTo(candidate.getName());
    }
}
