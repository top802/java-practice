package top.jia.passing_code_behavoir_parameterization;


import java.util.ArrayList;
import java.util.List;

public class Apple {

  private String appleVariety;

  private String color;

  private Double weight;

  private Double pricePerKilogram;

  public Apple(String appleVariety, String color, Double weight, Double pricePerKilogram) {
    this.appleVariety = appleVariety;
    this.color = color;
    this.weight = weight;
    this.pricePerKilogram = pricePerKilogram;
  }

  public static List<Apple> getAppleList(){
    List<Apple> appleList = new ArrayList<>();
    appleList.add(new Apple("Golden Delicious","Gold", 80.0, 10.0));
    appleList.add(new Apple("Golden Apple","Gold", 110.0, 10.0));
    appleList.add(new Apple("Red Jonson","Red", 115.0, 21.0));
    appleList.add(new Apple("Red Jonaprince","Red", 140.0, 18.0));
    appleList.add(new Apple("Florina","Green", 90.0, 15.0));
    appleList.add(new Apple("Gala","White", 150.0, 20.0));
    appleList.add(new Apple("Fuji","Green", 70.0, 12.0));
    appleList.add(new Apple("Granny Smith","Green", 55.0, 9.0));
    appleList.add(new Apple("Mutsu","White", 125.0, 22.0));
    appleList.add(new Apple("Red Chief","Red", 85.0, 8.0));
    return appleList;
  }

  public String getAppleVariety() {
    return appleVariety;
  }

  public void setAppleVariety(String appleVariety) {
    this.appleVariety = appleVariety;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public Double getWeight() {
    return weight;
  }

  public void setWeight(Double weight) {
    this.weight = weight;
  }

  public Double getPricePerKilogram() {
    return pricePerKilogram;
  }

  public void setPricePerKilogram(Double pricePerKilogram) {
    this.pricePerKilogram = pricePerKilogram;
  }

  @Override
  public String toString() {
    return "Apple{" +
        "appleVariety='" + appleVariety + '\'' +
        ", color='" + color + '\'' +
        ", weight=" + weight +
        ", pricePerKilogram=" + pricePerKilogram +
        '}';
  }
}
