public class App {
    public static void main(String[] args) throws Exception {
    String filacoches [] = {"FNC901", "RBP250", "TPS706", "ITN503", "LCS254", "ECT2 43" , "RPL122", " FRS484", "TLB884", "RSP845", "SBL560", "IVD432","NFT948 ", "INS230"};
    Peaje taquillaPeaje = new Peaje (filacoches);

    String[] cola = {"AO", "A1", "A2","A3", "A4", "A5", "A6", "A7", "A8", "A9", "A10", "A11"};
    TurnoVirtual turnoVirtuall = new TurnoVirtual (cola);

    String[] cancionesEscogidas = new String[] {"Mil horas",
    "Por ese hombre",
    "Ae esa",
    "Algo de mi",
    "Si me dejas ahora",
    "Quieres ser mi anante?",
    "Quel sorriso in volto",
    "Per una notte insieme",
    "Como un pintor",
    "SenciLlamente",
    "Un segundo",
    "Enciėndeme",
    "Cuando me ernamoro",
    "Tu eres mi tesoro ",
    "Piccola anima",
    "Solo a ti pertenezco",
    "Todos por todos"};
    ReproductorMusica ventanal = new ReproductorMusica (cancionesEscogidas);

    System.out.println(turnoVirtuall);

    }
}
