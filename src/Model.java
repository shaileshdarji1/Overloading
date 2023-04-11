public class Model {
    private String company;
    private String model;
    private int ram;
    private int rom;

    public Model(String company, String model, int ram, int rom) {
        this.company = company;
        this.model = model;
        this.ram = ram;
        this.rom = rom;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getRom() {
        return rom;
    }

    public void setRom(int rom) {
        this.rom = rom;
    }

    @Override
    public String toString() {
        return "Model{" +
                "company='" + company + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", rom=" + rom +
                '}';
    }
}
