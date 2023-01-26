public class SecretStudent {
    private String name = "Nic";
    public String OtkrycImie() {
        return name;
    }
    public void Podajimie(String name) {
        if(name.isEmpty()){
            System.out.println("Nie moze byc puste");
            return;
        }
        this.name = name;
    }
}