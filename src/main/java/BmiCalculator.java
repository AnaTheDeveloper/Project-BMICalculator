public class BmiCalculator {

  String name = "";
  double height = 0.0;          //In feet and inches | Cm
  double weight = 0.0;          //In stones and pounds | KG

  public BmiCalculator(String name, double height, double weight){

    this.name = name;
    this.height = height;
    this.weight = weight;

  }

  public String bmiFormula(){

    double bmi = weight / height * height;

    if (bmi <= 18.5) {
      return name + ", You are underweight.";
    }else if (bmi <= 25.0) {
      return name + ", You are normal weight.";
    }  else if (bmi <= 30.0){
      return name + ", You are overweight.";
    }  else if (bmi > 30){
      return name + ", You are obese.";
    } else {
      return name + ", Thank you for using this BMI calculator.";
    }

}}

//seperate classes for feet and inches and stone and pounds
//parameter feet