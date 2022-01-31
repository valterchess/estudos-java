import java.net.Socket;

public class Client {
    private String name;
    private long id;
    private Socket connection;

    public Client(String name, long id,Socket client){
        this.name = name;
        this.id = id;
        this.connection = client;
    }
    public long getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Socket getConnection() {
        return connection;
    }

    public void verificacao(long clientId, Client client){
        if (client.getId() == clientId){
            for(int i = 0; i <= InputController.getClassClientId(); i++){
                if (client.getId() == i){

        }
            } else if(Long.parseLong(contato.next()) > InputController.getClassClientId()){
                System.out.println("O id informado não foi encontrado");
            }
        }
    }

}
