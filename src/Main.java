public class Main {
    public static void main(String[] args) {
        var boxerOneWeight = 78.2;
        var boxerTwoWeight = 82.7;
        var totalBoxersWeight = boxerOneWeight + boxerTwoWeight;
        System.out.println("Общий вес двух бойцов " + totalBoxersWeight + " кг! ");
        var weightDifference = boxerTwoWeight - boxerOneWeight;
        System.out.println("Разница между весами бойцов " + weightDifference + " кг! ");
        var boxersWeightDifference = boxerTwoWeight % boxerOneWeight;
        System.out.println("Разница веса спортсменов " + boxersWeightDifference + " кг! ");
    }
}