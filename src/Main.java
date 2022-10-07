import java.util.Comparator;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Candidate> candidates = getCandidates();
        extracted(candidates);
    }

    private static TreeSet<Candidate> getCandidates() {
        TreeSet<Candidate> candidates = new TreeSet<>(Comparator.comparing(Candidate::getRelevance, Comparator.reverseOrder())
                .thenComparing(Candidate::getRating, Comparator.reverseOrder()));
        candidates.add(new Candidate("Сорокин Евгений Олегович", "30", "мужской", 5, 5));
        candidates.add(new Candidate("Иванов Иван Иванович", "31", "мужской", 5, 4));
        candidates.add(new Candidate("Петров Роман Романович", "35", "мужской", 3, 5));
        candidates.add(new Candidate("Соколов Виталий Константинович", "30", "мужской", 3, 4));
        candidates.add(new Candidate("Смирнов Михаил Петрович", "50", "мужской", 1, 5));
        candidates.add(new Candidate("Васильев Константин Олегович", "40", "мужской", 5, 1));
        candidates.add(new Candidate("Петрова Наталья Васильевна", "32", "женский", 2, 5));
        candidates.add(new Candidate("Птичкина Татьяна Олеговна", "20", "женский", 2, 3));
        candidates.add(new Candidate("Николаева Екатерина Евгеньевна", "32", "женский", 4, 1));
        candidates.add(new Candidate("Харченко Даниил Анатольевич", "22", "мужской", 3, 3));
        return candidates;
    }

    private static void extracted(TreeSet<Candidate> candidates) {
        System.out.printf("%15s %35s %5s \n", "ФИО", "Релевантность резюме", "Оценка на собеседовании");
        for (Candidate candidate : candidates) {
            System.out.println(candidate);
        }
    }
}