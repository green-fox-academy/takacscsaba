public class WarApp {

  public static void main(String[] args) {
    Armada EzerEvesSolyomArmada = new Armada("EzerEvesSolyomArmada");
    Armada EnterpriseArmada = new Armada("EnterpriseArmada");

    EzerEvesSolyomArmada.fillArmada();
    EzerEvesSolyomArmada.statusArmada();

    EnterpriseArmada.fillArmada();
    EnterpriseArmada.statusArmada();

    EzerEvesSolyomArmada.war(EnterpriseArmada);

    EzerEvesSolyomArmada.statusArmada();
    EnterpriseArmada.statusArmada();
  }
}