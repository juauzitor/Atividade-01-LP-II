package atv;

public class ProductionLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer();
		comp.setModel("Laser");
		comp.setcMotherBoard("Nasus", "ara541", "ddr4");
		comp.setcProcessor("j15-8753", 3, 8, 16);
		comp.setcRam("Lingston", 16, "ddr4", 2);
		comp.setcHd("SkyDoor", 250, "SSD");
		System.out.println("Saiu da linha de produção um computador: " + comp.getModel()+ ". Equipado com a placa mãe: " + comp.getcMotherBoard().getModel()+ ". Processador: " + comp.getcProcessor().getModel()+ ". Memoria ram de tamanho: " + comp.getcRam().getSize()+ ". E armazenamento de: " + comp.getcHd().getSize());
	}

}
