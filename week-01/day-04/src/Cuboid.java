public class Cuboid {
  public static void main(String[] args) {
    double a = 311;
    double b = 112;
    double c = 23;

    String area = "Surface area: ";
    String vol = "Volume: ";

    double areanum = (a*b+a*c+b*c)*2;
    double volnum = (a * b * c);

    System.out.println(area + areanum);
    System.out.println(vol + volnum);
  }
}
